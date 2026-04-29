package org.example.Arrays.leetcode;

import java.util.Scanner;

public class CheckArrayIsSorted {
    static boolean isSortedArray(int[] nums){
        int count =0;
        for(int i =0; i< nums.length; i++){
            for(int j =i; j< nums.length; j++){
                if(nums[i] > nums[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements in array ");
        for(int i =0; i< n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(isSortedArray(nums));
    }
}
