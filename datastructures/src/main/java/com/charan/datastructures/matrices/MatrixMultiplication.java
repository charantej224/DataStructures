package com.charan.datastructures.matrices;

import java.util.Arrays;

public class MatrixMultiplication {

    static int[][] matrix1 = {{10,23,33},{12,34,56}};
    static int matrix1Rows = 2;
    static int matrix1Columns = 3;
    static int[][] matrix2 = {{10,23},{33,12},{34,56}};
    static int matrix2Rows = 3;
    static int matrix2Columns = 2;
    static int[][] result = new int[matrix1Rows][matrix2Columns];
    public static void main(String[] args){
        for(int i=0;i < matrix1Rows;i++){
            for(int j=0;j < matrix2Columns;j++){
                for(int k=0;k < matrix2Rows;k++){
                    result[i][j] += matrix1[i][j] * matrix2[k][j];
                    System.out.print("matrix1 (i,j) " + i + "," + j);
                    System.out.println("\tmatrix2 (j,k) " + k + "," + j);
                }
                System.out.println("----------------------");
                System.out.println("row" + i + "column" + j + "product result" + result[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}
