package khmil.java8.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programm {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        Collections.addAll(phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P",
                "Samsung Galaxy S8", "LG G6", "Xiaomi MI6",
                "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6",
                "Pixel 2");
        phones.stream()
                .filter(p -> p.length() < 10)
                .sorted()
                .forEach(System.out::println);
    }
}
