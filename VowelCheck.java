package com.bridgelabz.JavaPP_Day5;

import java.util.Scanner;


public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to check if it's a vowel or a consonant: ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch+" is a vowel!");
                break;
            default:
                System.out.println(ch+" is a consonant!");
        }
    }
}
