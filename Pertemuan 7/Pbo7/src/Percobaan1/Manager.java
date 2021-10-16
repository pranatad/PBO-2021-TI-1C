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
public class Manager extends Karyawan {
    private double tunjangan;
    private String bagian;
    private Staff st[];

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getBagian() {
        return bagian;
    }

    public void setBagian(String bagian) {
        this.bagian = bagian;
    }

    public void setStaff (Staff st[]) {
        this.st = st;
    }
    
    public void viewStaff() {
        int i;
        System.out.println("------------------");
        for (i=0; i < st.length; i++) {
            st[i].lihatInfo();
        }
        System.out.println("------------------");
    }
    public void lihatInfo() {
        System.out.println("Manajer : " +this.getBagian());
        System.out.println("NIP : " +super.getNip());
        System.out.println("Nama : " +super.getNama());
        System.out.println("Golongan : " +super.getGolongan());
        System.out.println("Tunjangan : " +this.getTunjangan());
        System.out.printf("Gaji : %.0f\n", this.getGaji());
        System.out.println("Bagian : " +this.getBagian());
    }
    
    @Override
    public double getGaji() {
        return super.getGaji() + tunjangan;
    }
}
