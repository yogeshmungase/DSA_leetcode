package org.example.Arrays;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element");

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Print element in array");
        for(int num : arr){
            System.out.print(num+", ");
        }
    }
}
