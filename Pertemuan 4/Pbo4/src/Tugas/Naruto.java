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
public class Naruto {

    private String nama;
    private OrangTua ortu;
    private Guru guru;
    private AnggotaTujuh anggota;
    private Teman teman;

    Naruto() {

    }

    Naruto(String nama, OrangTua ortu, Guru guru, AnggotaTujuh anggota, Teman teman) {
        this.nama = nama;
        this.ortu = ortu;
        this.guru = guru;
        this.anggota = anggota;
        this.teman = teman;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public OrangTua getOrtu() {
        return ortu;
    }

    public void setOrtu(OrangTua ortu) {
        this.ortu = ortu;
    }

    public Guru getGuru() {
        return guru;
    }

    public void setGuru(Guru guru) {
        this.guru = guru;
    }

    public AnggotaTujuh getAnggota() {
        return anggota;
    }

    public void setAnggota(AnggotaTujuh anggota) {
        this.anggota = anggota;
    }

    public Teman getTeman() {
        return teman;
    }

    public void setTeman(Teman teman) {
        this.teman = teman;
    }

    public String info() {
        String info = "";
        info += " \n\t\t\t" + this.nama + "";
        info += "\n " + this.ortu.info() + "";
        info += "\n " + this.guru.info() + "";
        info += "\n " + this.anggota.info() + "";
        info += "\n " + this.teman.info() + "";
        return info;
    }
}
