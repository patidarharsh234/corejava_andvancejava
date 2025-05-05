package com.rays.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDuplicateAnotherArrayList {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(2);
        l.add(2);
        l.add(1);
        l.add(3);
      //  l.add(2);

        Set unique = new HashSet();
        Set duplicate = new HashSet();
        for (Object o : l) {
            if (!unique.add(o)) {
                duplicate.add(o);
            }
            
        }

        List duplicateList = new ArrayList(duplicate);
        List original = new ArrayList(unique);
        System.out.println("Original List: " + l);
        System.out.println("Unique List: " + original);
        System.out.println("Duplicate List: " + duplicateList);
    }
}