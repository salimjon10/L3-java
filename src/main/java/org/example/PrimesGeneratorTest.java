package org.example;

import java.util.List;
import java.util.ListIterator;

public class PrimesGeneratorTest {
    private final List list;

    PrimesGeneratorTest(List setList) {
        list = setList;
    }

    public void showList() {
        ListIterator iterator = list.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void showReversList() {
        ListIterator iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}