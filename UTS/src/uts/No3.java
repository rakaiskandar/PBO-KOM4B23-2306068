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
public class No3 {
    public static int reverse(int number) {
        int reversed = 0, remainder;

        while (number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }

        return reversed;
    }
    
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;

        System.out.print("Masukan tiga digit integer: ");
        bilangan = input.nextInt();

        if (!isPalindrome(bilangan)) {
            System.out.println(bilangan + " bukan palindrom");
        } else {
            System.out.println(bilangan + " adalah palindrom");
        }
    }
}
