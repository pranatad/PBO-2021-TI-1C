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
public class Guru {

    private String nama;
    private int umur;
    private String jenisKelamin;

    Guru() {

    }

    Guru(String nama, int umur, String jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String info() {
        String info = "\nGuru\n";
        info += "Nama: " + nama + "\n";
        info += "Umur: " + umur + "\n";
        info += "Jenis Kelamin: " + jenisKelamin + "\n";
        return info;
    }
}
