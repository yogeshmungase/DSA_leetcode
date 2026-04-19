package org.example.Arrays.leetcode;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[] arr = plusOne(digits);

        for(int num : arr){
            System.out.print(num+", ");
        }
    }
    public static int[] plusOne(int[] digits) {
        if(digits.length == 0) return new int[]{0};
        long sum =0;
        for(int i =0; i< digits.length; i++){
            sum *= 10;
            sum += digits[i];
            System.out.println("sum  :" + i +" --> " +sum );
        }
        System.out.println("Sum "+ sum);
        sum+=1;
        System.out.println("Sum "+ sum);
        String s = String.valueOf(sum);
        int n = s.length();
        int[] arr = new int[n];
        int i = n-1;

        for(i = n-1; i>=0;i--){
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
//        while(i >= 0){
//            arr[i] = s.charAt(i);
////            int rem = (int)sum % 10;
////            arr[i] = rem;
////            sum/=10;
//            i--;
//        }
        return arr;
    }
}
