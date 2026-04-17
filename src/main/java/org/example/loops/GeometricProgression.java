package org.example.loops;

public class GeometricProgression {
    public static void main(String[] args) {
        int a = 1; // start number
        int r = 2; // comman ratio

        for(int i =0; i<= 10; i++){
            System.out.print(a+", ");
            a*=r;
        }
    }
}
