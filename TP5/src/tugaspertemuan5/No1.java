/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspertemuan5;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class No1 {

    /**
     * @param args the command line arguments
     */
    static void checkRibuan(int num) {
        int count = 0;
        
        while (num != 0) {
            count++;
            num /= 10;
        }
            
        System.out.println(count == 4 ? "Ribuan" : "Bukan Ribuan");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            int num = input.nextInt();
            
            checkRibuan(num);
        }
        
        input.close();
    }
    
}
