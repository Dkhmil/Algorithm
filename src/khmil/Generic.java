package khmil;



class Generic {

    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        assert (mustBeTrue);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        assert (mustAlsoBeTrue);
    }
}

class Pair<T, E> {

    private T t;
    private E e;

    private Pair(T t, E e) {
        this.t = t;
        this.e = e;
    }

    public T getFirst() {
        return t;
    }

    public E getSecond() {
        return e;
    }

    public static <T, E> Pair<T, E> of(T t, E e) {
        return new Pair<>(t, e);
    }

    @Override
    public int hashCode() {
        final int c = 31;
        int result = 1;
        if (t != null) result = c * result + t.hashCode();
        if (e != null) result = c* result + e.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj.getClass() == this.getClass()) {
            return false;
        }
        Pair other = (Pair) obj;
        if ((t != null && !t.equals(other.t)) || (other.t != null && !other.t.equals(t))) return false;
        if ((e != null && !e.equals(other.e)) || (other.e != null && !other.e.equals(e))) return false;

        return true;
    }
}
