package com.charan.datastructures.warmup;

import java.util.Arrays;

public class WarmupProblems {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int counter = 0;
        float plus = 0;
        float minus = 0;
        float neutral = 0;

        while (counter < arr.length) {
            if (arr[counter] > 0)
                plus += 1;
            else if (arr[counter] < 0)
                minus += 1;
            else
                neutral += 1;
            counter++;
        }
        System.out.format("%.6f\n", (plus / arr.length));
        System.out.format("%.6f\n", (minus / arr.length));
        System.out.format("%.6f\n", (neutral / arr.length));
    }

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        int counter = 0;
        long min = 0, max = 0;
        while (counter < arr.length) {
            if (counter != 0)
                max += arr[counter];
            if (counter != arr.length - 1)
                min += arr[counter];
            counter++;
        }
        System.out.println(min + " " + max);
    }

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        int largest = 0;
        int largestCount = 0;
        int counter = 0;
        while (counter < ar.length) {
            if (ar[counter] > largest) {
                largest = ar[counter];
                largestCount = 1;
            } else if (ar[counter] == largest) {
                largestCount++;
            }
            counter++;
        }
        return largestCount;
    }

    static String timeConversion(String s) {
        String converted_string = "";
        if (s.endsWith("AM"))
            if (s.startsWith("12")) {
                converted_string = s.replace("AM", "");
                converted_string = converted_string.replace("12", "00");
            } else
                converted_string = s.replace("AM", "");
        else if (s.endsWith("PM")) {
            if (s.startsWith("12"))
                converted_string = s.replace("PM", "");
            else {
                converted_string = s.replace("PM", "");
                String[] tokens = converted_string.split(":");
                int hour = Integer.valueOf(tokens[0]) + 12;
                if (hour >= 24)
                    tokens[0] = "00";
                else
                    tokens[0] = String.valueOf(hour);
                converted_string = tokens[0] + ":" + tokens[1] + ":" + tokens[2];
            }
        }
        return converted_string;
    }


    public static void main(String[] args) {
/*        int[] arr1 = {10, 20, 30, 20};
        System.out.println(birthdayCakeCandles(arr1));*/
        System.out.println(timeConversion("12:45:54PM"));
    }
}
