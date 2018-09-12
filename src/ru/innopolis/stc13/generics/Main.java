package ru.innopolis.stc13.generics;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
/*        Integer[] myArray = new Integer[]{12,4,34,23,5};
        System.out.println(myArray[2]);*/

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(4);
        arrayList.add(12);
        Integer i = arrayList.get(1);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Mark");
        hashMap.put(2, "Jane");
        hashMap.put(3, "Freddie");
        System.out.println(hashMap.get(2));
    }
}
