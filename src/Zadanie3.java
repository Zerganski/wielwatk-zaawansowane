public class Zadanie3 {
    /*
Kod z użyciem słowa kluczowego synchronized
W przykładzie SynchronizedExample używane jest słowo kluczowe synchronized w bloku kodu, który chroni sekcję krytyczną.
Główną różnicą jest to, że synchronized automatycznie zarządza blokadą (mutexem) na podstawie zasobu (obiektu), który jest przekazywany jako argument.
Gdy wątek wejdzie do sekcji krytycznej, blokada jest automatycznie aktywowana, a po jej opuszczeniu blokada jest zwalniana. Jeżeli sekcja krytyczna jest już zablokowana przez inny wątek,
wątek próbuje uzyskać dostęp do sekcji i czeka, aż zostanie zwolniona. Tylko jeden wątek na raz może wykonywać kod w sekcji krytycznej.

Kod z użyciem klasy ReentrantLock
W przykładzie MutexExample używane jest ReentrantLock, który jest klasą implementującą interfejs Lock.
ReentrantLock umożliwia bardziej elastyczną kontrolę blokad i odblokowywania sekcji krytycznych niż synchronized.
W odróżnieniu od synchronized, ReentrantLock może być wykorzystywany w trybie sprawiedliwym (fair) lub niesprawiedliwym (unfair).
Można też próbować przechwycić blokadę przez określony czas. W przypadku podwójnego wywołania lock() przez ten sam wątek, blokada musi być zwolniona dwukrotnie (unlock()).
W przeciwnym razie zgłoszony zostanie wyjątek IllegalMonitorStateException.

Kod z użyciem klasy Semaphore
W przykładzie SemaphoreExample używane jest Semaphore, który reprezentuje semafor o określonym liczbie zasobów.
W przypadku tego przykładu, semafor ma tylko jeden zasób. Wątek, który chce uzyskać dostęp do sekcji krytycznej,
musi najpierw wywołać acquire() na semaforze, a następnie release(), gdy sekcja krytyczna zostanie zakończona.
Semafor kontroluje dostęp do sekcji krytycznej, a inne wątki czekają, aż semafor zwolni zasób. W przypadku podwójnego wywołania acquire() przez ten sam wątek,
semafor nadal utrzymuje jeden zasób, a drugie wywołanie blokuje wątek do momentu zwolnienia zasobu przez pierwsze wywołanie release().

Kod z użyciem klasy ReadWriteLock
W przykładzie ReadWriteLockExample używane jest ReadWriteLock, który reprezentuje blokadę do odczytu/zapisu.
ReadWriteLock składa się z blokady do odczytu i blokady do zapisu. Wątki, które chcą odczytywać dane (nie modyfikować ich),
mogą uzyskać dostęp równoczesny do sekcji krytycznej, jeśli żadna inna wątki nie zapisują danych. Natomiast tylko jeden wątek na raz może uzyskać blokadę do zapisu.
W przypadku podwójnego wywołania readLock().lock() lub writeLock().lock() przez ten sam wątek, wątek będzie czekał, aż zostanie zwolniona odpowiednia blokada przed kontynuacją.

Podsumowując, różnica między zastosowaniem słowa kluczowego synchronized, klasy ReentrantLock,
klasy ReadWriteLock oraz klasy Semaphore polega na sposobie zarządzania blokadami, elastyczności w kontrolowaniu dostępu do sekcji krytycznej i zachowaniu w przypadku podwójnego wywołania blokady przez ten sam wątek.
Każde z tych rozwiązań ma swoje zastosowania w zależności od konkretnego scenariusza.
     */
}
