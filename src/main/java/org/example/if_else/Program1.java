package org.example.if_else;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
