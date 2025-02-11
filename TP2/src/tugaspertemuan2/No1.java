/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspertemuan2;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class No1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan 3 angka pecahan negatif:");
        float num1, num2, num3;
        
        num1 = input.nextFloat();
        num2 = input.nextFloat();
        num3 = input.nextFloat();
        
        System.out.println("Hasil operasi (+,-,*,/):");
        System.out.println("Pertambahan (+): " + (num1 + num2 + num3));
        System.out.println("Pengurangan (-): " + (num1 - num2 - num3));
        System.out.println("Perkalian (*): " + (num1 * num2 * num3));
        System.out.println("Pembagian (/): " + (num1 / num2 / num3));
    }
    
}
