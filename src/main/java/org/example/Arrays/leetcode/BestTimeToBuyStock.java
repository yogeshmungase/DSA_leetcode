package org.example.Arrays.leetcode;

import java.util.Scanner;

public class BestTimeToBuyStock {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int  max =0;
        for(int i = 0; i< prices.length; i++){
            for(int j = i+1; j < prices.length; j++){ // time complexity = o(n^2)
                if(prices[i] < prices[j]){
                    max = prices[j] - prices[i];
                    System.out.println(max);
                }

                if( max >= profit){
                    profit =  max ;
                    System.out.println(profit);
                }
            }
        }
        return profit;
    }

    public int maxProfits(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            if (price < minPrice) {
                minPrice = price; // buy here
            } else {
                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element :");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxProfit(arr));
    }
}
