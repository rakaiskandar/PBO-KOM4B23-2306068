/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan5;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class No2 {
    static void printPrimeOrCompositeNumber(int awal, int akhir, String jenisAngka) {
        for (int i = awal; i <= akhir; i++) {
            if (i > 1) {
                boolean isPrime = true;
                
                for (int j = 2; j * j <= i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                
                if (jenisAngka.equals(jenisAngka)) {
                    if (isPrime) {
                        System.out.print(i + " ");
                    } 
                } else {
                    if (!isPrime) {
                        System.out.print(i + " ");
                    } 
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();
        
        System.out.println("Bilangan prima dari " + batasAwal + " sampai " + batasAkhir + " adalah:");
        printPrimeOrCompositeNumber(batasAwal, batasAkhir, "Prima");
        
        System.out.println("\nBilangan komposit dari " + batasAwal + " sampai " + batasAkhir + " adalah:");
        printPrimeOrCompositeNumber(batasAwal, batasAkhir, "Komposit");
        
        System.out.println();

        input.close();
    }
}
