package org.example.two_d_array;

public class MaxRowSum {
    public static void main(String[] args) {
        int[][] result = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int Max =Integer.MIN_VALUE;
        int row = -1;
        for(int i=0; i<result.length; i++){
            int sum =0;
            for(int j =0; j<result[0].length; j++){
                sum+= result[i][j];
            }
            if(sum > Max){
                Max = sum;
                row = i;
            }
        }
        System.out.println(Max +", "+ row);
    }
}
