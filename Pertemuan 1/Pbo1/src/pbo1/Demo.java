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
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keyboard kbd1 = new Keyboard();
        Keyboard kbd2 = new Keyboard();
        Mouse m1 = new Mouse();
        Mouse m2 = new Mouse();
        TvTabung tt1 = new TvTabung();
        TvTabung tt2 = new TvTabung();
        TvLcd tl1 = new TvLcd();
        TvLcd tl2 = new TvLcd();

        // Keyboard
        System.out.println("KEYBOARD 1");
        kbd1.setMerk("Rexus");
        kbd1.setWarnaSwitch("Blue");
        kbd1.setButton(87);
        kbd1.cetakKeyboard();

        System.out.println();
        System.out.println("KEYBOARD 2");
        kbd1.setMerk("Rexus Legionare");
        kbd1.setWarnaSwitch("Red");
        kbd1.setButton(104);
        kbd1.cetakKeyboard();

        // Mouse
        System.out.println();
        System.out.println("MOUSE 1");
        m1.setMerk("Logitech G102");
        m1.setTipe("Mechanical");
        m1.setDpi(8000);
        //m1.kurangiDpi(7400);
        //m1.tambahDpi(2400);
        m1.cetakMouse();

        System.out.println();
        System.out.println("MOUSE 2");
        m1.setMerk("Votre");
        m1.setTipe("Wireless");
        m1.setDpi(600);
        m1.cetakMouse();

        // TV (TABUNG)
        System.out.println();
        System.out.println("TV TABUNG 1");
        tt1.setMerk("Polytron");
        tt1.setUkuranLayar(19);
        tt1.cetakTv();
        
        System.out.println();
        System.out.println("TV TABUNG 2");
        tt1.setMerk("Toshiba");
        tt1.setUkuranLayar(21);
        tt1.cetakTv();
        
        // TV (LCD)
        System.out.println();
        System.out.println("TV LCD 1");
        tl1.setMerk("LG");
        tl1.setUkuranLayar(24);
        tl1.setWaktuRespon("60hz");
        tl1.setResolusi(720);
        tl1.cetakTv();
        
        System.out.println();
        System.out.println("TV LCD 2");
        tl2.setMerk("Samsung");
        tl2.setUkuranLayar(32);
        tl2.setWaktuRespon("144hz");
        tl2.setResolusi(1440);
        tl2.cetakTv();
    }

}
