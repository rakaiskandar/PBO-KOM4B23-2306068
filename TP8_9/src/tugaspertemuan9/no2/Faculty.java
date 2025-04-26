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
public class Faculty extends Employee {
    private String jamKerja;
    private String pangkat;

    public Faculty(String nama, String noTelp, String alamat, String email, String kantor, int gaji, LocalDate tglKerja, String jamKerja, String pangkat) {
        super(nama, noTelp, alamat, email, kantor, gaji, tglKerja);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    public String getJamKerja() {
        return jamKerja;
    }

    public String getPangkat() {
        return pangkat;
    }

    public void setJamKerja(String jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Nama: " + super.getNama() + " dari kelas " + getClass().getSimpleName();
    }
}
