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
public class Gorilla extends Binatang implements IKarnivora, IHerbivora {

    public String suara;
    public String warnaBulu;

    Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;

    }

    @Override
    public void displayMakan() {
        System.out.println("Hewan ini adalah OMNIVORA dikarenakan makan dedaunan, buah-buahan dan juga daging");
    }

    @Override
    public void displayBinatang() {
        System.out.println("Nama hewan ini adalah " +super.nama);
    }
    public void displayData() {
        System.out.println("Hewan ini memiliki jumlah kaki " +super.jmlKaki);
        System.out.println("Hewan ini memiliki suara " +suara);
        System.out.println("Hewan ini memiliki warna bulu " +warnaBulu);
        System.out.println("-------------------------------------------------");
    }
}
