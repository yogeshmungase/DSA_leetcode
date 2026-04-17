package org.example.loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i =2; i<=n; i++){
            if(i % 2 != 0 && i % 3 != 0){
                System.out.println(i);
            }
        }
    }
}
