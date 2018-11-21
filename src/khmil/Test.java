package khmil;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        List<String> stringList = new LinkedList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        ListIterator<String> iter = stringList.listIterator();
        while (iter.hasNext()) {
            if (iter.next().equals("2")) {
                iter.remove();
            }
        }
        for(String s : stringList) {
            System.out.println(s);
        }
    }
}
