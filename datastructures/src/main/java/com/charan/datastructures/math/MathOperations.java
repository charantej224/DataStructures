package com.charan.datastructures.math;

public class MathOperations {

    public int greatestCommonFactor(int a, int b) {
        if (a == b)
            return a;
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a > b)
            return greatestCommonFactor(a - b, b);
        return greatestCommonFactor(a, b - a);
    }
}
