package com.bridgelabz.JavaPP_Day5;

import java.util.Scanner;

public class FP_Array2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter rows for 2D array: ");
            int row = sc.nextInt();
            System.out.println("Enter columns for 2D array: ");
            int col = sc.nextInt();

            int[][] array = new int[row][col];

            System.out.println("Enter array values: ");

            for (int i=0; i<row; i++) {
                for (int j=0; j<col; j++) {
                    array[i][j] = sc.nextInt();
                }
            }
            print(row, col, array);
        }finally {
            sc.close();
        }
    }


    public static void print(int row, int col, int[][] array) {
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}