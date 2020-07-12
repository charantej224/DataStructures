package com.charan.datastructures.warmup;

import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

public class StairCase {
    public static void main(String[] args) {
        staircase(10);
    }

    static void staircase(int n) {
        String val = "####################################################################################################";
        String spc = "                                                                                                    ";
        int counter = 1;
        while (counter <= n) {
            System.out.println(spc.substring(0, n - counter) + val.substring(0, counter));
            counter++;
        }
    }
}
