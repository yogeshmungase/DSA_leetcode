package org.example.CodeForce;

import java.util.Scanner;

public class WeirdChessboard {
    static void board(int n ){
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                if ((i+j) >= n-1 && (i+j) %2 ==0 || j==n-1) {
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of test cases :");
        int t = sc.nextInt();


        while(t>0){
            System.out.println("Enter the value of N : ");
            int n = sc.nextInt();
            t--;
            board(n);
        }


    }
}
