package org.example.Arrays;

import java.util.Scanner;

public class Sagregate0And1 {
    public static int[] sagregate0And1(int[] arr){
        int n = arr.length;
        int i =0;
        int j = n-1;

        while (i<j){
            if(arr[i] == 1 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }else if(arr[i] == 0){
                i++;
            } else if (arr[j] == 1) {
                j--;
            }
        }

        return arr;
    }
    public static int[] sagregate(int[] arr){
        int n = arr.length;
        int countZero = 0;
        for(int num : arr){
            if(num == 0){
                countZero++;
            }
        }
        int i =0;
       while(countZero-- > 0){
           arr[i] = 0;
           i++;
       }
       while(i < n){
           arr[i] = 1;
           i++;
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
        //int[] nums = sagregate(arr);
        int[] nums = sagregate0And1(arr);
        for(int num : nums){
            System.out.print(num+", ");
        }
    }
}
