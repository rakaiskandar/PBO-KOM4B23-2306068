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
public class No3 {
    static void printPolaSegitigaSikuSiku(int N, String pola) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(pola);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        
        printPolaSegitigaSikuSiku(N, "*");
        
        input.close();
    }
}
