package org.example.two_d_array;

public class TransposeMatrix {
    static void print(int[][] arr){
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,0,1,2},{1,5,6,7}};
        System.out.println("Before Transpose Matrix :");
       print(arr);

        System.out.println("After transpose Matrix :");
        for(int i =1; i< arr.length; i++){
            for (int j =0; j< i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp ;
            }
        }
        print(arr);
    }
}
