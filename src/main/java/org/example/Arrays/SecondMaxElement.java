package org.example.Arrays;

import java.util.Scanner;

public class SecondMaxElement {
    public static int secondMaxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i] > max)
                secondMax = max;
                max = arr[i];
            if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
         //return max;
        return secondMax;
    }

    public static int secondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max){
                smax = max;
                max = num;
            }else if(num > smax && num != max){
                smax = num;
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements :");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(secondMaxElement(arr));
        //System.out.println(secondMax(arr));
    }
}
