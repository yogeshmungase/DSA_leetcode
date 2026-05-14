package org.example.two_d_array;

import java.util.ArrayList;

public class MatricesMultiply {
    public static ArrayList<ArrayList<Integer>> multiply(int[][] a, int[][] b){
        int n = a.length;
        //int[][] c = new int[n][n];
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i =0; i< n; i++){
            ans.add(new ArrayList<>());
            for(int j = 0; j< n; j++){
                int sum =0;
                for(int k = 0; k<n; k++){
                    sum += a[i][k] * b[k][j];
                }
                ans.get(i).add(sum);
            }
        }
     return  ans;
    }
    public static void main(String[] args) {
      int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
      int[][] b = {{1,2,3},{4,5,6},{7,8,9}};

        multiply(a,b);
    }
}
