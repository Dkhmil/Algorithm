package khmil;

public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public int size() {
        return size;
    }

    public void add(T t) {
        Node<T> node = new Node<>(t);
        addNode(node);
        size++;
    }

    public T get(int index) {
        return getNode(index).value;
    }

    public void remove(int index) {
        Node<T> node = getNode(index);
        removeNode(node);
        size--;
    }

    public void removeByValue(T t) {
        Node<T> node = getNodeByValue(t);
        removeNode(node);
        size--;
    }

    private Node<T> getNode(int index) {
        if (index > size - 1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> node;
        if (index > size / 2) {
            node = getFromTail(size - (index + 1));
        } else {
            node = getFromHead(index);
        }
        return node;
    }

    private Node<T> getFromTail(int index) {
        Node<T> node = tail;
        for (int i = 0; i < index; i++) {
            node = node.prev;
        }
        return node;
    }

    private Node<T> getFromHead(int index) {
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private void addNode(Node<T> node) {
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    private void removeNode(Node<T> node) {
        if (node.equals(head)) {
            head = node.next;
        } else if (node.equals(tail)) {
            tail = node.prev;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

    }

    private Node<T> getNodeByValue(T value) {
        Node<T> node = head;
        Node<T> result = null;
        for (int i = 0; i < size; i++) {
            if (node.value == value) {
                result = node;
                break;
            }
            node = node.next;
        }
        return result;
    }

    class Node<T> {
        private T value;
        private Node prev;
        private Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.removeByValue(4);
        System.out.println(num.get(3));
    }
}