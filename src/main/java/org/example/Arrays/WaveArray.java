package org.example.Arrays;

import java.util.Scanner;

public class WaveArray {
    public static int[] convertToWave(int[] arr){
        int n = arr.length;
        for(int i =0; i < n-1; i+=2){
            //if( i == n-1 ) break;
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1]= temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of array :");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] nums = convertToWave(arr);

        for(int num : nums){
            System.out.print(num+",");
        }
    }
}
