package khmil;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class ArrayListTest {
    ArrayList<Integer> numbers = new ArrayList<>();

    @Before
    public void creatingOfInstanceWithElements() {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
    }

    @Test
    public void testCheckingArraysSizePositiveScenario() {
        int actual = numbers.size();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testCheckingLinkedListsSizeNegativeScenario() {
        for (int i = 0; i <= numbers.size(); i++) {
            numbers.remove(i);
        }
    }

    @Test
    public void testAddingElementPositiveScenario() {
        numbers.add(98);
        int actual = numbers.get(numbers.size() - 1);
        int expected = 98;
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testAddingElementNegativeScenario() {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        if (numbers.get(15) == null) {
            throw new NullPointerException();
        }
    }

    @Test
    public void testGettingElementPositiveScenario() {
        int actual = numbers.get(0);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGettingElementNegativeScenario() {
        for (int i = 0; i < 5; i++) {
            numbers.remove(i);
        }
        int check = numbers.get(4);
    }

    @Test
    public void testRemovingElementByIndexPositiveScenario() {
        numbers.remove(0);
        int actual = numbers.get(0);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testRemovingElementByIndexNegativeScenario() {
        numbers.remove(6);
        int t = numbers.get(6);
    }

    @Test
    public void testRemovingElementByValuePositiveScenario() {
        numbers.removeByValue(2);
        int actual = numbers.get(1);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemovingElementByValueNegativeScenario() {
        numbers.removeByValue(5);
        int a = 5;
        for (int i = 0; i < numbers.size(); i++) {
            if (a != i) {
                throw new NoSuchElementException();
            }
        }
    }
}