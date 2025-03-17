/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspertemuan7;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static void fillArray(int[] arr){
        Random rand = new Random();
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = new int[100000];
        fillArray(arr);
        
        StopWatch s = new StopWatch();
        
        s.start();
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        s.stop();
        
        System.out.println("Waktu eksekusi untuk 100.000 angka acak yang diurutkan menggunakan selection sort adalah " 
                + (s.getElapsedTime() / 1_000_000) + " millidetik");
    }
    
}
