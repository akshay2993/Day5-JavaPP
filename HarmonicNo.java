package com.bridgelabz.JavaPP_Day5;

import java.util.Scanner;

public class HarmonicNo {
    public static void main(String[] args) {
        System.out.println("Enter N to print its Harmonic no.: ");
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double result = 0.0;

        while(N > 0){
            result += (double)1/N;
            N--;
            System.out.println(result +", ");
        }
    }
}
