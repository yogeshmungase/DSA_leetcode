package org.example.two_d_array;

import java.util.Scanner;

public class MinElementInRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] result = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int Max =Integer.MIN_VALUE;
        int rowMin = Integer.MAX_VALUE;
        for(int i=0; i<result.length; i++){
            for(int j =0; j<result[0].length; j++){
                if(result[i][j] > Max){
                    Max = result[i][j];
                }
            }
            if(Max < rowMin){
                rowMin = Max;
            }
        }
        System.out.println(rowMin);
    }
}
