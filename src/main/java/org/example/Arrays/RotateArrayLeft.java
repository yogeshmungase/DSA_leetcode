package org.example.Arrays;

import java.util.Scanner;

public class RotateArrayLeft {

    static int[] swapArray(int[] arr, int i, int j){

        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    static void rotateArray(int[] arr, int k ){
        int n = arr.length;
        k = k%n;
        swapArray(arr, 0, k-1);
        swapArray(arr, k,n-1);
        swapArray(arr, 0, n-1);


        for(int num : arr){
            System.out.print(num+",");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        System.out.println("Enter the value of K :");
        int k = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element in array :");
        for(int i =0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        rotateArray(arr, k);
    }
}
