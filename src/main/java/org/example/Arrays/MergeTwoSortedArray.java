package org.example.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] nums = {2,4,5};
        int m = arr.length;
        int n = nums.length;
        int[] result = new int[m+n];
        int k = 0;
        int i = 0; int j=0;
        while(i < m && j < n){
            if(arr[i] < nums[j] ){
                result[k] = arr[i];
                 i++;
            }else {
                result[k] = nums[j];
                 j++;
            }
            k++;
        }
        while (i < m){
            result[k] = arr[i];
            k++; i++;
        }

        while(j < n){
            result[k] = nums[j];
            k++; j++;
        }

        for(int num : result){
            System.out.print(num+", ");
        }
    }
}
