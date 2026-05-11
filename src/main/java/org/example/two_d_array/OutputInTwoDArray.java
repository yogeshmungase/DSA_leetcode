package org.example.two_d_array;

import java.util.Scanner;

public class OutputInTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[][] arr = { {1,2,3}, {4,5,6}, {7,8,9} };

        int[][] result = new int[3][4];
        System.out.println("Enter the elements :");
        for(int i =0; i< result.length; i++){
            for(int j =0; j<result[0].length; j++){
                result[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0; i<result.length; i++){
            for(int j =0; j<result[0].length; j++){
                System.out.print(result[i][j]+", ");
            }
            System.out.println();
        }
    }
}
