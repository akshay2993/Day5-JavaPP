package com.bridgelabz.JavaPP_Day5;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping 1st & 2nd numnber:\n1st Number = "+num1+"\n"+"2nd Number :"+num2);

    }
}
