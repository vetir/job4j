package thread_ref;

import net.jcip.annotations.NotThreadSafe;
import net.jcip.annotations.ThreadSafe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;


//@ThreadSafe
//public class UserCache {
//    private final ConcurrentHashMap<Integer, job4j.User> users = new ConcurrentHashMap<>();
//    private final AtomicInteger id = new AtomicInteger();
//
//    public void add(job4j.User user) {
//        users.put(id.incrementAndGet(), job4j.User.of(user.getName()));
//    }
//
//    public job4j.User findById(int id) {
//        return job4j.User.of(users.get(id).getName());
//    }
//}

@NotThreadSafe
public class UserCache {
    private final ConcurrentHashMap<Integer, User> users = new ConcurrentHashMap<>();
    private final AtomicInteger id = new AtomicInteger();

    public void add(User user) {
        users.put(id.incrementAndGet(), User.of(user.getName()));
    }

    public User findById(int id) {
        return User.of(users.get(id).getName());
    }

    public List<User> findAll() {
        List<User> lisUsers = new ArrayList<>();
        for (User user : users.values()) {
            lisUsers.add(User.of(user.getName()));
        }
        return lisUsers;
    }
}
