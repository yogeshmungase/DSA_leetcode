package org.example.Arrays;

import java.util.Scanner;

public class CheckElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array :");
        int n = sc.nextInt();
        System.out.println("Enter the target element :");
        int t = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements :");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }


//        for(int i = 0; i<n; i++){
//            if(arr[i] == t){
//                System.out.println("Present");
//               break;
//            }
//        }
        int i =0;
        while(i < n){
            if(arr[i] == t){
                System.out.println("Present");
            }
            i++;
        }
    }
}
