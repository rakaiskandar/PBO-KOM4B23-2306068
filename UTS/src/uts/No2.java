/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class No2 {

    static void patternA(int N) {
        System.out.println("Pattern A");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void patternB(int N) {
        System.out.println("Pattern B");
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void patternC(int N) {
        System.out.println("Pattern C");
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    static void patternD(int N) {
        System.out.println("Pattern D");
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih pattern: ");
        char pilih = input.next().charAt(0);

        switch (pilih) {
            case 'A' -> patternA(6);
            case 'B' -> patternB(6);
            case 'C' -> patternC(6);
            case 'D' -> patternD(6);
        }
    }
}
