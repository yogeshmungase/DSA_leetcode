package org.example.pattern;

import java.util.Scanner;

public class BridgePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            // Spaces in middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("   ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}
