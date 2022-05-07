package com.bridgelabz.JavaPP_Day5;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to find largest: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 >= num2) {
            if(num1 >= num3)
                System.out.println(num1 + " is the largest number.");
            else
                System.out.println(num3 + " is the largest number.");
        } else {
            if(num2 >= num3)
                System.out.println(num2 + " is the largest number.");
            else
                System.out.println(num3 + " is the largest number.");
        }
    }
}
