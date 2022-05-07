package com.bridgelabz.JavaPP_Day5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to print its powers of two:");
        int N = sc.nextInt();
        for (int i=0; i<=N; i++){
            System.out.println("2^ "+i+" = "+(int)Math.pow(2, i)+"\n");
        }
    }
}
