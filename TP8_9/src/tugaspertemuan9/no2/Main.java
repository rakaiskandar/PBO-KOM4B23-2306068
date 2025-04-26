/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan9.no2;

import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Raka", "083820002958", "Jalan", "isk@gamil.com");
        Student s2 = new Student(p1.nama, p1.noTelp, p1.alamat, p1.email, "Mahasiswa Tahun Kedua");
        
        LocalDate tglKerja = LocalDate.of(2023, 8, 21);
        Employee e3 = new Employee("Yana", "083820002958", "Jalan", "isk@gamil.com", "PT Pertamina", 12000000, tglKerja);
        
        Faculty f4 = new Faculty(e3.nama, e3.noTelp, e3.alamat, e3.email, e3.getKantor(), e3.getGaji(), e3.getTglKerja(), "09:00 - 15:30", "Staf Admin");
        Staff s5 = new Staff(e3.nama, e3.noTelp, e3.alamat, e3.email, e3.getKantor(), e3.getGaji(), e3.getTglKerja(), "Sarjana");
        
        System.out.println(p1); 
        System.out.println(s2);
        System.out.println("\n" + e3);
        System.out.println("Kantor: " + e3.getKantor() + "\nGaji: " + e3.getGaji() + "\nMulai Kerja: " + e3.getTglKerja() + "\n");
        System.out.println(f4); 
        System.out.println("Jam Kerja: " + f4.getJamKerja() + "\nPangkat: " + f4.getPangkat() + "\n");
        System.out.println(s5); 
        System.out.println("Gelar: " + s5.getGelar());
    }
}
