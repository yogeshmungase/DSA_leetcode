package org.example.loops;

import java.util.Scanner;

public class QuestionHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();

        for(int i = 1; i<=n;i++){
            System.out.println(i);
            System.out.println(n-i);
        }
    }
}
