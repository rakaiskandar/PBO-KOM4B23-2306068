/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author HP
 */
public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;
    
    Balok() {
        panjang = 1;
        lebar = 1;
        tinggi = 1;
    }
    
    Balok(int panjangBaru, int lebarBaru, int tinggiBaru) {
        panjang = panjangBaru;
        lebar = lebarBaru;
        tinggi = tinggiBaru;
    }

    int getLebar() {
        return lebar;
    }

    int getPanjang() {
        return panjang;
    }

    int getTinggi() {
        return tinggi;
    }

    void setLebar(int lebar) {
        this.lebar = lebar;
    }

    void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    int getLuas() {
        return 2 * ((this.panjang * this.lebar) + (this.panjang * this.tinggi) + (this.lebar * this.tinggi));
    }
    
    int getKeliling() {
        return 4 * (this.panjang + this.lebar + this.tinggi);
    }
    
    int getVolume() {
        return this.panjang * this.lebar * this.tinggi;
    }
}
