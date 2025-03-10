/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan6;
/**
 *
 * @author HP
 */
public class PersegiPanjang {
    int panjang;
    int lebar;

    PersegiPanjang() {
        panjang = 1;
        lebar = 1;
    }
    
    PersegiPanjang(int newPanjang, int newLebar) {
        panjang = newPanjang;
        lebar = newLebar;
    }

    void setPanjang(int newPanjang) {
        panjang = newPanjang;
    }

    void setLebar(int newLebar) {
        lebar = newLebar;
    }
    
    int getKeliling() {
        return 2 * (panjang + lebar);
    }
    
    int getLuas() {
        return panjang * lebar;
    }
}
