package com.charan.datastructures.warmup;

import java.util.ArrayList;
import java.util.List;

public class SampleTest {

    static List<Integer> intList = new ArrayList<>();

    public static void main(String[] args) {

        intList.add(1234);
        intList.add(2345);
        intList.add(3456);

        for (int counter = 0; counter < intList.size(); counter++) {
            if (counter - 1 < 0)
                System.out.println(intList.get(counter) + " " + intList.get(counter));
            else
                System.out.println(intList.get(counter - 1) + " " + intList.get(counter));
        }


    }
}
