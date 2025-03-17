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
    private int panjang;
    private int lebar;

    PersegiPanjang() {
        panjang = 1;
        lebar = 1;
    }
    
    PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getPanjang() {
        return panjang;
    }
    
    int getKeliling() {
        return 2 * (this.panjang + this.lebar);
    }
    
    int getLuas() {
        return this.panjang * this.lebar;
    }
}
