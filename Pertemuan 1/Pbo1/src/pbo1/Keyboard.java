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
public class Keyboard {

    private String merk, warnaSwitch;
    private int button;

    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void setWarnaSwitch(String newValue) {
        warnaSwitch = newValue;
    }

    public void setButton(int newValue) {
        button = newValue;
    }

    public void cetakKeyboard() {
        System.out.println("Merk : " + merk);
        System.out.println("Switch : " + warnaSwitch);
        System.out.println("Jumlah Tombol : " + button);
    }

}
