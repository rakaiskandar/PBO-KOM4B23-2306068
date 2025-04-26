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
public class Employee extends Person {
    private String kantor;
    private int gaji;
    private LocalDate tglKerja;

    public Employee(String nama, String noTelp, String alamat, String email, String kantor, int gaji, LocalDate tglKerja) {
        super(nama, noTelp, alamat, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tglKerja = tglKerja;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void setKantor(String kantor) {
        this.kantor = kantor;
    }

    public void setTglKerja(LocalDate tglKerja) {
        this.tglKerja = tglKerja;
    }
    
    public int getGaji() {
        return gaji;
    }

    public String getKantor() {
        return kantor;
    }

    public LocalDate getTglKerja() {
        return tglKerja;
    }

    @Override
    public String toString() {
        return "Nama: " + super.getNama() + " dari kelas " + getClass().getSimpleName();
    }
}
