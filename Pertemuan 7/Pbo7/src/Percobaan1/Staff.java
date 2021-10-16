/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author Pranata
 */
public class Staff extends Karyawan {
    private int lembur;
    private double gajiLembur;

    public int getLembur() {
        return lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
    
    public double getGaji(int lembur, double gajiLembur) {
        return super.getGaji() + lembur*gajiLembur;
    }
    
    @Override
    public double getGaji() {
        return super.getGaji() + lembur*gajiLembur;
    }
    
    public void lihatInfo() {
        System.out.println("NIP : " +super.getNip());
        System.out.println("Nama : " +super.getNama());
        System.out.println("Golongan : " +super.getGolongan());
        System.out.println("Jumlah Lembur : " +this.getLembur());
        System.out.printf("Gaji Lembur : %.0f\n", this.getGajiLembur());
        System.out.printf("Gaji : %.0f\n", this.getGaji());
    }
}
