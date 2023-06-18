import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionComparison {
    private static final int NUM_ELEMENTS = 1000000;

    public static void main(String[] args) {
        List<Integer> normalList = new ArrayList<>();
        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());

        // Dodawanie do zwykłej kolekcji
        long startTime = System.currentTimeMillis();
        addElements(normalList);
        long endTime = System.currentTimeMillis();
        long normalListTime = endTime - startTime;

        // Dodawanie do zsynchronizowanej kolekcji
        startTime = System.currentTimeMillis();
        addElements(synchronizedList);
        endTime = System.currentTimeMillis();
        long synchronizedListTime = endTime - startTime;

        System.out.println("Czas dodawania do zwykłej kolekcji: " + normalListTime + " ms");
        System.out.println("Czas dodawania do zsynchronizowanej kolekcji: " + synchronizedListTime + " ms");
    }

    private static void addElements(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            list.add(random.nextInt());
        }
    }
}
