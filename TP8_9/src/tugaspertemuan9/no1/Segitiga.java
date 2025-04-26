/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan9.no1;

/**
 *
 * @author HP
 */
public class Segitiga extends Geometris {
    private double side1;
    private double side2;
    private double side3;

    public Segitiga() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Segitiga(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
    
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    @Override
    public String toString() {
        return "Segitiga: \nsisi1 = " + this.side1 + " sisi2 = " + this.side1 + " sisi3 = " + this.side3;
    }
    
}
