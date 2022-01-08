package linked;

/**
 * Закоментировать и отредактировать класс чтоб он был immutable
 * 1. Нужно чтоб все поля объекта были final
 */

public final class Node<T> {
    private final Node<T> next;
    private final T value;

    public Node(Node<T> next, T value) {
        this.next = next;
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

//    public void setNext(Node<T> next) {
//        this.next = next;
//    }

    public T getValue() {
        return value;
    }

//    public void setValue(T value) {
//        this.value = value;
//    }
}
