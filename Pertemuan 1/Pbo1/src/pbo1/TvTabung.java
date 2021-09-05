/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1;

/**
 *
 * @author Pranata
 */
public class TvTabung {

    private String merk;
    private int ukuranLayar;

    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void setUkuranLayar(int newValue) {
        ukuranLayar = newValue;
    }

    public void cetakTv() {
        System.out.println("Merk : " + merk);
        System.out.println("Ukuran Layar : " + ukuranLayar);
    }

}
