/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspertemuan3;

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
        
        System.out.println("Masukkan 2 buah bilangan:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        if((num1 % 2 == 0) && (num2 % 2 == 0)){
            System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        }else {
            System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
        }
        
    }
    
}
