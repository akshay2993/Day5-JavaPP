package com.bridgelabz.JavaPP_Day5;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to divide:");
        int dividend = sc.nextInt();
        System.out.println("Enter a no. to divide by:");
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println(dividend+" / "+divisor+" = "+quotient+" remainder "+remainder);
    }
}
