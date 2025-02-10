/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class No2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah tabungan: ");
        int tabungan = input.nextInt();
        
        System.out.print("Apakah sudah ada pasangan(Y/T): ");
        char pasangan = input.next().charAt(0);
        
        boolean check = ((tabungan > 100000000) && (pasangan == 'Y' || pasangan == 'y'));
        
        System.out.println("Tabungan: " + tabungan);
        System.out.println("Sudah ada pasangan: " + pasangan);
        System.out.println("Kondisi menikah: " + check);
        
    }
}
