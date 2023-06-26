package com.epam.mjc.collections.list;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int numA = 5 * Integer.parseInt(a) * Integer.parseInt(a) + 3;
        int numB = 5 * Integer.parseInt(b) * Integer.parseInt(b) + 3;
        if (numA != numB){
            return numA - numB;
        } else {
            return a.compareTo(b);
                    }
    }
}
