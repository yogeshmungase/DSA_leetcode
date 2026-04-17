package org.example.pattern.patternTwo;

import java.util.Scanner;

public class StarTriangleFlippedVertically {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        // method 1
//        for(int i =1; i<=n;i++){
//            for(int j = 1; j<=n;j++){
//                if(i+j > n){
//                    System.out.print(" * ");
//                }else System.out.print("   ");
//            }
//
//            System.out.println();
//        }

        for(int i =1; i<=n;i++){
            for(int j =1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
