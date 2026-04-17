package org.example.loops;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int original = n;
        int rev =0;
        while(n>0){
            int rem = n % 10;
            rev*=10;
            rev += rem;
            n/=10;
        }
        int sum = original + rev;
        System.out.println(sum);
        System.out.println(rev);
    }
}
