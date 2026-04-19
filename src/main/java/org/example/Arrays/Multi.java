package org.example.Arrays;

import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements :");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int j =0 ; j<n; j++){
            if(j % 2 == 0){
                arr[j] *=2;
            }else {
                arr[j] += 10;
            }
        }

        for(int num : arr){
            System.out.print(num+", ");
        }
    }
}
