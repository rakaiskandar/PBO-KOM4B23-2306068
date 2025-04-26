/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan9.no2;

/**
 *
 * @author HP
 */
public class Student extends Person {
    final private String status;

    public Student(String nama, String noTelp, String alamat, String email, String status) {
        super(nama, noTelp, alamat, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Status: " + this.status + " dari kelas " + getClass().getSimpleName();
    }
   
}
