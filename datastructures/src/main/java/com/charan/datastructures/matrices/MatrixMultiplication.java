package com.charan.datastructures.matrices;

import java.util.Arrays;

public class MatrixMultiplication {

    static int[][] matrix1 = {{10,23,33},{12,34,56},{10,12,20}};
    static int matrix1Rows = 3;
    static int matrix1Columns = 3;
    static int[][] matrix2 = {{10,23,12,23,24},{33,12,12,24,12},{34,56,12,12,12}};
    static int matrix2Rows = 3;
    static int matrix2Columns = 5;
    static int[][] result = new int[matrix1Rows][matrix2Columns];
    public static void main(String[] args){
        for(int i=0;i < matrix1Rows;i++){
            for(int j=0;j < matrix2Columns;j++){
                for(int k=0;k < matrix2Rows;k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
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
