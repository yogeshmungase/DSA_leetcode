package org.example.Arrays.leetcode;

public class ThirdMaxElement {
    public static int thirdMax(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for(int i =0;i< nums.length; i++){
           if(nums[i] > firstMax){
               thirdMax = secondMax;
               secondMax = firstMax;
               firstMax = nums[i];
           }else if( nums[i] > secondMax && nums[i] != firstMax){
                secondMax = nums[i];
           } else if (nums[i] > thirdMax && nums[i] != secondMax) {
               thirdMax = nums[i];
           }
        }
//        if(nums.length == 2){
//            return secondMax;
//        }
        return secondMax;
    }
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(thirdMax(nums));
    }

}
