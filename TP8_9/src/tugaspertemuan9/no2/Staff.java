/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan9.no2;

/**
 *
 * @author HP
 */
public class Staff extends Employee {
    private String gelar;

    public Staff(String nama, String noTelp, String alamat, String email, String kantor, int gaji, String tglKerja, String gelar) {
        super(nama, noTelp, alamat, email, kantor, gaji, tglKerja);
        this.gelar = gelar;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return "Nama: " + super.getNama() + " dari kelas " + getClass().getSimpleName();
    }
}
