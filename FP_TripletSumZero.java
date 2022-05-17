package com.bridgelabz.JavaPP_Day5;

public class FP_TripletSumZero {
    static void findTriplets(int arr[], int n) {
        boolean found = false;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++){
                for (int k = j+1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("{ " + arr[i] +", "+ arr[j] +", "+ arr[k]+" }");
                        found = true;
                    }
                }
            }
        }
        if (found == false) {
            System.out.println("No triplets found with sum zero!");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2 , 0 , -4,3};
        int n = arr.length;

        findTriplets(arr, n);
    }
}
