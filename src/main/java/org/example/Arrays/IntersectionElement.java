package org.example.Arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionElement {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        for(int i =0; i< nums1.length; i++){
            for(int j =0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    list.contains(nums1[i]);
                    continue;
                }else {
                    list.add(nums1[i]);
                }
            }
        }
        System.out.println(list);
        int n = list.size();
        int[] arr = new int[n];
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2= {2,2};
        int[] ints = intersection(arr1, arr2);
        for(int i : ints){
            System.out.print(i+",");
        }

    }
}
