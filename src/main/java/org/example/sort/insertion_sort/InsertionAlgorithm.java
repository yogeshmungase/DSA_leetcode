package org.example.sort.insertion_sort;

import java.util.Scanner;

public class InsertionAlgorithm {

    static int[] sort(int[] arr){
        int n = arr.length;

        for(int i =1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while (j>= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return  arr;
    }

    static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in array :");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] result = sort(arr);
        printArray(result);
    }
}
