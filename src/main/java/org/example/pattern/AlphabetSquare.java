package org.example.pattern;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
         n = 65+n;

         for(int i = 65; i<n; i++){
             for(int j = 65; j<n; j++){
                 System.out.print((char)j+" ");
             }
             System.out.println();
         }
    }
}
