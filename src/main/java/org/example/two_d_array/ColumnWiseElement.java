package org.example.two_d_array;

public class ColumnWiseElement {
    public static void main(String[] args) {
        int[][] result = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        for(int i =0; i<result[0].length; i++){
            for(int j =0; j< result.length; j++){
                System.out.print(result[i][j]+", ");
            }
            System.out.println();
        }
    }
}
