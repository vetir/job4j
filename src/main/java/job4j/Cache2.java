package job4j;

import net.jcip.annotations.ThreadSafe;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@ThreadSafe
public class Cache2 {
    public class Cache {
        private final ConcurrentHashMap<Integer, String> dic = new ConcurrentHashMap<>();
        private final AtomicInteger ids = new AtomicInteger();

        public Cache() {
            dic.put(ids.incrementAndGet(), "Petr Arsentev");
            dic.put(ids.incrementAndGet(), "Ivan Ivanov");
        }

        public void add(String name) {
            dic.put(ids.incrementAndGet(), name);
        }

        public boolean contains(String name) {
            return dic.containsValue(name);
        }
    }
}
