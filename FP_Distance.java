package com.bridgelabz.JavaPP_Day5;

import java.util.Scanner;

public class FP_Distance {

    static void calcDistance(int x, int y) {
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Euclidean distance b/w ("+ x +", "+ y +") and (0, 0): "+distance+" units");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x & y coordinates of (x, y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        calcDistance(x, y);
    }
}
