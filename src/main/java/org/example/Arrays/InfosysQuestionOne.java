package org.example.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InfosysQuestionOne {
    public static int solution(int[] arr, int k, int n){
        int count = 0;

        Arrays.sort(arr);
//        for(int i =0; i< 2*n-1; ){
//            if(arr[i] - arr[i+1] <= k){
//                count++;
//                i+=2;
//            }else {
//                i++;
//            }
//        }

        int i =0;
        while(i < 2*n-1){
            if(arr[i] - arr[i+1] <= k){
                count++;
                i+=2;
            }else {
                i++;
            }
        }


        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pair :");
        int n = sc.nextInt();
        System.out.println("Enter the target value :");
        int k = sc.nextInt();
        int[] arr = new int[2*n];
        System.out.println("Enter the element in array ");
        for(int i =0; i< 2*n ; i++){
            arr[i] = sc.nextInt();
        }

        int ans = solution(arr, k, n);
        System.out.println(ans);
    }
}
