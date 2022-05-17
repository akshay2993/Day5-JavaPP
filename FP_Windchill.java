package com.bridgelabz.JavaPP_Day5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FP_Windchill {

    static DecimalFormat df = new DecimalFormat("0.00");
    static void effectiveTemp(double t, double v) {
        double  windchill = 35.74 + 0.625*t +((0.4275*t - 35.75)*Math.pow(v, 0.16));
        System.out.println("The Effective temperature is : "+df.format(windchill));
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in F(< 50): ");
        double t = sc.nextDouble();
        System.out.println("Enter wind speed in Mph(3 > v < 120): ");
        double v = sc.nextDouble();

        effectiveTemp(t, v);

    }
}
