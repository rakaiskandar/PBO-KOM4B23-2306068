/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan3;

import java.util.Scanner;
/**
 *
 * @author HP-
 */
public class No2 {
    public static void main(String[] args) {
        final double bobotUTS = 0.35, bobotUAS = 0.45, bobotTugas = 0.20;
        Scanner input = new Scanner(System.in);
        int nilaiUTS, nilaiUAS, nilaiTugas;
        
        System.out.println("Masukkan nilai:");
        System.out.print("UTS: ");
        nilaiUTS = input.nextInt();
        System.out.print("UAS: ");
        nilaiUAS = input.nextInt();
        System.out.print("Tugas: ");
        nilaiTugas = input.nextInt();
        
        double nilaiAkhir = (nilaiUTS * bobotUTS) + (nilaiUAS * bobotUAS) + (nilaiTugas * bobotTugas);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            System.out.println("A");
        }else if(nilaiAkhir >= 70 && nilaiAkhir < 80) {
            System.out.println("B");
        }else if(nilaiAkhir >= 50 && nilaiAkhir < 70){
            System.out.println("C");
        }else {
            System.out.println("D");
        }
    }
}
