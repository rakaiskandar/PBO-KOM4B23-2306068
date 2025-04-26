/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspertemuan9.no1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        System.out.println("Masukkan sisi-sisi segitiga 1:");
        int s1Side1 = i.nextInt();
        int s1Side2 = i.nextInt();
        int s1Side3 = i.nextInt();
        i.nextLine(); // Buang newline
        
        Segitiga s1 = new Segitiga(s1Side1, s1Side2, s1Side3);
        System.out.print("Masukkan warna segitiga 1: ");
        String color1 = i.nextLine();
        s1.setColor(color1);
        s1.setIsFilled(true);
        
        System.out.println("\nMasukkan sisi-sisi segitiga 2:");
        int s2Side1 = i.nextInt();
        int s2Side2 = i.nextInt();
        int s2Side3 = i.nextInt();
        i.nextLine();
        
        Segitiga s2 = new Segitiga(s2Side1, s2Side2, s2Side3);
        System.out.print("Masukkan warna segitiga 2: ");
        String color2 = i.nextLine();
        s2.setColor(color2);
        s2.setIsFilled(false);
        
        System.out.println("\nMasukkan sisi-sisi segitiga 3:");
        int s3Side1 = i.nextInt();
        int s3Side2 = i.nextInt();
        int s3Side3 = i.nextInt();
        i.nextLine();
        
        Segitiga s3 = new Segitiga(s3Side1, s3Side2, s3Side3);
        System.out.print("Masukkan warna segitiga 3: ");
        String color3 = i.nextLine();
        s3.setColor(color3);
        s3.setIsFilled(true);
        
        System.out.println("\nData Segitiga 1:");
        tampilkanData(s1);
        System.out.println("\nData Segitiga 2:");
        tampilkanData(s2);
        System.out.println("\nData Segitiga 3:");
        tampilkanData(s3);
    }
    
    static void tampilkanData(Segitiga segitiga) {
        System.out.println(segitiga);
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Warna: " + segitiga.getColor());
        System.out.println("Terisi: " + segitiga.getIsFilled());
    }
}
