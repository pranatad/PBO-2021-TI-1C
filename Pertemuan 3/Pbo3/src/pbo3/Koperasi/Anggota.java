/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.Koperasi;

/**
 *
 * @author Pranata
 */
public class Anggota {

    public String nomorKtp;
    public String nama;
    public int limitPinjaman;
    public int jumlahPinjaman;
    public int angsur;

    Anggota(String nomorKtp, String nama, int limitPinjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getNomor() {
        return nomorKtp;
    }

    public void setNomor(String newNomor) {
        nomorKtp = newNomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String newNama) {
        nama = newNama;
    }

    public int getLimitPinjaman() {
        return limitPinjaman;
    }

    public void setLimitPinjaman(int newLimitPinjaman) {
        if (newLimitPinjaman > 5000000) {
            System.out.println("Pinjaman melebihi batas!");
        }
    }

    public void pinjam(int newJumlahPinjaman) {
        jumlahPinjaman = newJumlahPinjaman;
    }

    public void angsur(int newAngsur) {
        angsur = newAngsur;

    }

    public int getJumlahPinjaman() {
        if (jumlahPinjaman > limitPinjaman) {
            jumlahPinjaman = 0;
        } else if (angsur <= (jumlahPinjaman * 10 / 100)) {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
            return jumlahPinjaman;
        }
        return jumlahPinjaman -= angsur;
    }
}
