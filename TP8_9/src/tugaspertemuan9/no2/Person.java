/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan9.no2;

/**
 *
 * @author HP
 */
public class Person {
    protected String nama;
    protected String noTelp;
    protected String alamat;
    protected String email;

    public Person() {
    }

    public Person(String nama, String noTelp, String alamat, String email) {
        this.nama = nama;
        this.noTelp = noTelp;
        this.alamat = alamat;
        this.email = email;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Nama: " + this.nama + "\nAlamat: " + this.alamat + "\nNo Telp: " + this.noTelp + "\nEmail: " + this.email + " dari kelas " + getClass().getSimpleName();
    }
    
}
