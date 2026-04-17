package org.example.pattern.patternTwo;

import java.util.Scanner;

public class AlphabetTriangleTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        for(int i =1; i<=n;i++){
            for(int j = 1; j<=n-i+1;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
