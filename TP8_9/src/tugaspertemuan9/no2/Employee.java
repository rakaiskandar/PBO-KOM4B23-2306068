/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan9.no2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HP
 */
public class Employee extends Person {
    private String kantor;
    private int gaji;
    private Date tglKerja;

    public Employee(String nama, String noTelp, String alamat, String email, String kantor, int gaji, Date tglKerja) {
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

    public void setTglKerja(String tglKerja) {
        this.tglKerja = MyDate(tglKerja);
    }
    
    public int getGaji() {
        return gaji;
    }

    public String getKantor() {
        return kantor;
    }

    public Date getTglKerja() {
        return tglKerja;
    }
    
    public String getFormattedTglKerja() {
        return MyDate(tglKerja); 
    }

    @Override
    public String toString() {
        return "Nama: " + super.getNama() + " dari kelas " + getClass().getSimpleName();
    }
    
    final static Date MyDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Format tanggal salah. Harusnya dd-MM-yyyy!");
            return null;
        }
    }
    
    public static String MyDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }
}
