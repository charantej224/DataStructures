package com.charan.datastructures.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileSplitter {

    public static void main(String[] args) throws IOException {
        String value = "";
        Random random = new Random();
        int i = 0, outerCounter = 0;
        while (true) {
            i++;
            value = value + " , " + random.nextInt();
            if (i >= 20000) {
                value += "/n";
                i = 0;
                outerCounter++;
                System.out.println(outerCounter);
            }
            if (outerCounter >= 5)
                break;
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("sample.txt"));
        writer.write(value);
        writer.close();
    }
}
