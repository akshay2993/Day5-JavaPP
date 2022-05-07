package com.bridgelabz.JavaPP_Day5;
import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args){
        double headCount =0;
        double tailCount =0;
        System.out.println("Enter no. of turns to flip coin: ");
        Scanner sc = new Scanner(System.in);
        double turns = sc.nextDouble();

        for(int i=0; i<turns; i++){
            double value = Math.random();

            if(value < 0.5){
                headCount++;
            }else {
                tailCount++;
            }
        }
        double percentHead = Math.round((headCount/turns)*100);
        double percentTail = Math.round((tailCount/turns)*100);

        System.out.println("Percentage of Heads: "+percentHead+"%");
        System.out.println("Percentage of Tails: "+percentTail+"%");
    }
}
