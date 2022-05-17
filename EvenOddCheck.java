package com.bridgelabz.JavaPP_Day5;

import java.util.Scanner;

public class EvenOddCheck {
    static boolean check(int num) {
        if(num %2 == 0){
            return(true);
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to check if it's even or odd");
        int num = sc.nextInt();

        System.out.println(check(num) ? "It is an even number." : "It is an odd number.");

    }
}
