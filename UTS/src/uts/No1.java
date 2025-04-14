/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    static int reverse(int bil) {
        int reversed = 0, remainder;

        while (bil != 0) {
            remainder = bil % 10;
            reversed = reversed * 10 + remainder;
            bil /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int bilangan;

        System.out.print("Masukan tiga digit integer: ");
        bilangan = input.nextInt();

        int reversed = reverse(bilangan);

        if (bilangan == reversed) {
            System.out.println(bilangan + " adalah palindrom");
        } else {
            System.out.println(bilangan + " bukan palindrom");
        }
    }
}
