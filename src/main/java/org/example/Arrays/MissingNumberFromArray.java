package org.example.Arrays;

import java.util.Scanner;

public class MissingNumberFromArray {
    static int missingNumber(int[] arr){
        int n = arr.length;
        int sumofArray =0;
        int sum = n*(n+1)/2;
        for(int nums: arr){
            sumofArray += nums;
        }
        return sum - sumofArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element in array :");
        for(int i =0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr));
    }
}
