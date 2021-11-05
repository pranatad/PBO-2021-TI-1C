/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Pranata
 */
public class Keledai extends Binatang implements IHerbivora {

    public String suara;
    public String warnaBulu;

    Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;

    }

    @Override
    public void displayMakan() {
        System.out.println("Hewan ini adalah HERBIVORA dikarenakan makan dedaunan dan buah-buahan");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Nama hewan ini adalah " + super.nama);
    }

    public void displayData() {
        System.out.println("Hewan ini memiliki jumlah kaki " + super.jmlKaki);
        System.out.println("Hewan ini memiliki suara " + suara);
        System.out.println("Hewan ini memiliki warna bulu " + warnaBulu);
        System.out.println("-------------------------------------------------");
    }
}
