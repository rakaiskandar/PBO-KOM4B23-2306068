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
        
        int i = 1;
        
        while(i <= 3) {
            int num = input.nextInt();
            
            if(String.valueOf(Math.abs(num)).length() == 4) {
                System.out.println("Ribuan");
            } else {
                System.out.println("Bukan Ribuan");
            }
            
            i++;
        } 
        
        input.close();
    }
}
