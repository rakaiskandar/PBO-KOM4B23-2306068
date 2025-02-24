/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();
        
        System.out.println("Bilangan prima dari " + batasAwal + " sampai " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i > 1) {
                boolean isPrime = true;
                
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                
                if (isPrime) {
                    System.out.print(i + " ");
                } 
            }
        }
        
        System.out.println("\nBilangan komposit dari " + batasAwal + " sampai " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i > 1) {
                boolean isPrime = true;
                
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                
                if (!isPrime) {
                    System.out.print(i + " ");
                }
            }
        }

        input.close();
    }
}
