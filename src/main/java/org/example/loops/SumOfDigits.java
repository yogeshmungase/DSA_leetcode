package org.example.loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number :");
        int n = sc.nextInt();
        int sum =0;
        while(n>0){
            int rem = n% 10;
            sum+=rem;
            n/=10;
        }
        System.out.println(sum);
    }
}
