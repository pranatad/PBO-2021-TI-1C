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
public class Mouse {

    private String merk, tipe;
    private int dpi;

    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void setTipe(String newValue) {
        tipe = newValue;
    }

    public void setDpi(int newValue) {
        dpi = newValue;
    }

    public void tambahDpi(int increment) {
        dpi += increment;
    }

    public void kurangiDpi(int decrement) {
        dpi -= decrement;
    }

    public void cetakMouse() {
        System.out.println("Merk : " + merk);
        System.out.println("Tipe : " + tipe);
        System.out.println("DPI : " + dpi);
    }
}
