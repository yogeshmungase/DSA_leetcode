package org.example.two_d_array;

public class SnakePattern {
    public static void main(String[] args) {
        int[][] result = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        for(int i =0; i< result.length; i++){
            if(i % 2 == 0){
                for(int j =0; j< result[0].length; j++){
                    System.out.print(result[i][j]+", ");
                }
                System.out.println();
            }else {
                for(int j = result[0].length-1; j >= 0; j-- ){
                    System.out.print(result[i][j]+", ");
                }
                System.out.println();
            }
        }
    }
}
