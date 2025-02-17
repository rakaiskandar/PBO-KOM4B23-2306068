/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mobil = 1;
        
        System.out.print("Masukkan jumlah penumpang: ");
        int penumpang = input.nextInt();
        
        
        if(penumpang % 7 == 0) {
            mobil = (penumpang / 7);
        }else {
            mobil += (penumpang / 7);
        }
        
        System.out.println("Mobil yang disediakan: " + mobil);
    }
}
