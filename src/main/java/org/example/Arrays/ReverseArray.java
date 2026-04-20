package org.example.Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void reverseArray(int[] arr){
        int i = 0; int j = arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for( int num : arr){
            System.out.print(num+", ");
        }
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
        reverseArray(arr);
    }
}
