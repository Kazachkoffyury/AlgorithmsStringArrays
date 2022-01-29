package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StringList stringList = new StringListImpl();
        System.out.println(stringList.add("petro"));
        System.out.println(stringList.getSize());
        System.out.println(stringList.add("brusko"));
        System.out.println(stringList.getSize());
        System.out.println(stringList.contains("petro"));
        System.out.println(stringList.remove("petro"));
        System.out.println(stringList.contains("petro"));
        System.out.println(stringList.getSize());
        System.out.println(stringList.add("saverio"));
        System.out.println(stringList.indexOf("saverio"));
        System.out.println(stringList.lastIndexOf("saverio"));
        System.out.println(stringList.indexOf("jaja"));
        System.out.println(stringList.set(1, "Tomio"));
        System.out.println(stringList.contains("Bobi"));
        System.out.println(Arrays.toString(stringList.toArray()));
        System.out.println(stringList.remove(1));
        System.out.println(stringList.contains("Tom"));
        System.out.println(stringList.getSize());
        System.out.println(stringList.add(0, "jaja"));
        System.out.println(Arrays.toString(stringList.toArray()));

    }
}
