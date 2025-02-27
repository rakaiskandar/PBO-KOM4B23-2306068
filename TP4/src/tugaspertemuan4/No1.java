/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspertemuan4;

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
        
        for (int i = 0; i < 3; i++) {
            int num = input.nextInt(), count = 0;
            int temp = num;
            
            while (temp != 0) {
                count++;
                temp /= 10;
            }
            
            System.out.println(count == 4 ? "Ribuan" : "Bukan Ribuan");
        }
        
        input.close();
    }
}
