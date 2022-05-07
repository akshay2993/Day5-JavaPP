package com.bridgelabz.JavaPP_Day5;
import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args){
        System.out.println("Enter year to check leap year or not: \n");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year % 4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    System.out.println(year+" is a leap year!");
                }else{
                    System.out.println(year+" is not a leap year!");
                }
            }else {
                System.out.println(year+" is a leap year!");
            }
        }else {
            System.out.println(year+" is not a leap year!");
        }
    }
}
