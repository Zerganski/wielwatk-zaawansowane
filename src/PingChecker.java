import java.net.InetAddress;

public class PingChecker implements Runnable {
    private final String url;
    private final ThreadLocal<Integer> counter;

    public PingChecker(String url, ThreadLocal<Integer> counter) {
        this.url = url;
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            InetAddress address = InetAddress.getByName(url);
            long startTime = System.currentTimeMillis();
            boolean isReachable = address.isReachable(5000); // 5 sekund
            long endTime = System.currentTimeMillis();

            if (isReachable) {
                long pingTime = endTime - startTime;
                System.out.println("Ping to " + url + " successful. Time: " + pingTime + "ms");
            } else {
                System.out.println("Ping to " + url + " failed.");
            }

            counter.set(counter.get() + 1);
            System.out.println("Thread " + Thread.currentThread().getId() + " counter: " + counter.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadLocal<Integer> counter = ThreadLocal.withInitial(() -> 0);

        Thread thread1 = new Thread(new PingChecker("google.com", counter));
        Thread thread2 = new Thread(new PingChecker("example.com", counter));

        thread1.start();
        thread2.start();
    }
}