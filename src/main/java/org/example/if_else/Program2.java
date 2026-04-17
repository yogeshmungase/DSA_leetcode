package org.example.if_else;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        if(n % 5 == 0){
            System.out.println("number is divisible by 5");
        }
    }
}
