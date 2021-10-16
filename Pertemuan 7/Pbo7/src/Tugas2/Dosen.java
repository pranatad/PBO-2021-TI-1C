/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Pranata
 */
public class Dosen extends Manusia {

    @Override
    public void makan() {
        System.out.println("> Dosen = diharuskan untuk makan");
    }

    public void lembur() {
        System.out.println("> Dosen = dapat bekerja sampai lembur");
        System.out.println();
    }
}
