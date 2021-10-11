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
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS;
    
    Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setTARIF_SKS(int TARIF_SKS) {
        this.TARIF_SKS = TARIF_SKS;
    }
    @Override
    public int getGaji() {
        return gaji;
    }
}
