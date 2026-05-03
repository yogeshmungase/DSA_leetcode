package org.example.sort.selection_sort;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    static int[] twoSum(int[] arr, int target){
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target){
                return new int[]{arr[i], arr[j]};
            }
            else if(sum > target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[0];
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
        System.out.println("Enter the target :");
        int target = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in array :");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] result = twoSum(arr, target);
        printArray(result);
    }
}
