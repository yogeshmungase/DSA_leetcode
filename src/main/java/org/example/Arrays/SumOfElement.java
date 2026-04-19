package org.example.Arrays;

import java.util.Scanner;

public class SumOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements :");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum =0;
        int product = 1;
        for(int i =0; i<n; i++){
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println(sum);
        System.out.println(product);
    }
}
