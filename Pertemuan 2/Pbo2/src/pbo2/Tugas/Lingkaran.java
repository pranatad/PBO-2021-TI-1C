/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.Tugas;

/**
 *
 * @author Pranata
 */
public class Lingkaran {

    public double phi;
    public double r;

    public void hitungLuas() {
        double luas = phi * (r * r);
        System.out.println("Maka Luas Lingkaran adalah = " + luas);
    }

    public void hitungKeliling() {
        double keliling = 2 * phi * r;
        System.out.println("Maka Keliling Lingkaran adalah = " + keliling);
    }
}
