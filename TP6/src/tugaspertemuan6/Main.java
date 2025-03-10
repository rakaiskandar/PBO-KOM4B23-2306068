/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspertemuan6;
/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        
        System.out.println("Persegi Panjang 1:");
        System.out.println("Panjang: " + persegiPanjang1.panjang + "\n" + "Lebar: " + persegiPanjang1.lebar);
        System.out.println("Luas: " + persegiPanjang1.getLuas() + " cm^2");
        System.out.println("Keliling: " + persegiPanjang1.getKeliling() + " cm");
        
        System.out.println("\nPersegi Panjang 2:");
        PersegiPanjang persegiPanjang2 = new PersegiPanjang();
        persegiPanjang1.setPanjang(30);
        persegiPanjang1.setLebar(40);
        System.out.println("Panjang: " + persegiPanjang2.panjang + "\n" + "Lebar: " + persegiPanjang2.lebar);
        System.out.println("Luas: " + persegiPanjang2.getLuas() + " cm^2");
        System.out.println("Keliling: " + persegiPanjang2.getKeliling() + " cm");
        
        System.out.println("\nPersegi Panjang 3:");
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);
        System.out.println("Panjang: " + persegiPanjang3.panjang + "\n" + "Lebar: " + persegiPanjang3.lebar);
        System.out.println("Luas: " + persegiPanjang3.getLuas() + " cm^2");
        System.out.println("Keliling: " + persegiPanjang3.getKeliling() + " cm");
    }
    
}
