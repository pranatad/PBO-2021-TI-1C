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
public class TvLcd extends TvTabung {

    private String waktuRespon;
    private int resolusi;

    public void setWaktuRespon(String newValue) {
        waktuRespon = newValue;
    }
    public void setResolusi(int newValue) {
        resolusi = newValue;
    }

    public void cetakTv() {
        super.cetakTv();
        System.out.println("Kecepatan Respon : " + waktuRespon);
        System.out.println("Resolusi : " + resolusi);
    }
}
