package khmil;

public class ArrayList<T> {
    private static final int INITIAL_LENGTH = 16;
    private int size = 0;
    private int currentLength;
    private static final double LOAD_FACTOR = 1.25;

    private Object[] array;

    public int size() {
        return size;
    }

    public void add(T t) {
        if (size * LOAD_FACTOR >= currentLength) {
            increaseLengthArray();
        }
        array[size] = t;
        size += 1;
    }

    public T get(int index) {
        return (T) array[index];
    }

    public void remove(int index) {
        System.arraycopy(array, index + 1, array, index, size);
        size--;
        if (size * LOAD_FACTOR <= currentLength) {
            decreaseLengthArray();
        }
    }

    public void removeByValue(T t) {
        int index;
        int i = 0;
        while (array[i] != t) {
            index = i;
            i++;
        }
        remove(i);
    }

    private void increaseLengthArray() {
        currentLength *= LOAD_FACTOR;
        Object[] result = new Object[currentLength];
        System.arraycopy(array, 0, result, 0, size);
        array = result;
    }

    private void decreaseLengthArray() {
        currentLength /= LOAD_FACTOR;
        Object[] result = new Object[currentLength];
        System.arraycopy(array, 0, result, 0, size);
        array = result;
    }

    public ArrayList() {
        this.array = new Object[INITIAL_LENGTH];
        currentLength = INITIAL_LENGTH;
    }

    public static void main(String[] args) {
    }
}
