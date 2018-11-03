package khmil;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList<Integer> linkedList = new LinkedList<>();

    @Before
    public void creatingOfInstanceWithElements() {
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
    }

    @Test
    public void testCheckingLinkedListsSizePositiveScenario() {
        linkedList.remove(5);
        int actual = linkedList.size();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testCheckingLinkedListsSizeNegativeScenario() {
        for (int i = 0; i <= linkedList.size(); i++) {
            linkedList.remove(i);
        }
    }

    @Test
    public void testAddingOfElementsPositiveScenario() {
        linkedList.add(9);
        int actual = linkedList.get(8);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testAddingOfElementsNegativeScenario() {
        int[] ret = new int[linkedList.size()];
        for (int i = 0; i < linkedList.size(); i++) {
            ret[i] = linkedList.get(i);
        }
        linkedList.add(1169);
        int check = ret[8];
    }

    @Test
    public void testGettingElementPositiveScenario() {
        int actual = linkedList.get(7);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGettingElementNegativeScenario() {
        int t = linkedList.get(-5);
    }

    @Test
    public void testRemovingElementByIndexPositiveScenario() {
        linkedList.remove(5);
        int actual = linkedList.get(5);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemovingElementByIndexNegativeScenario() {
        linkedList.remove(7);
        int t = linkedList.get(7);
    }

    @Test
    public void testRemoveElementByValuePositiveScenario() {
        linkedList.removeByValue(6);
        int actual = linkedList.get(5);
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveElementByValueNegativeScenario() {
        linkedList.removeByValue(6);
        int a = 6;
        for (int i = 0; i < linkedList.size(); i++) {
            if (a != linkedList.get(i)) {
                throw new NoSuchElementException();
            }
        }
    }
}