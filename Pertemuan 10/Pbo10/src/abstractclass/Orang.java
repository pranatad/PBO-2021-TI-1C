/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author Pranata
 */
public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;
    
    Orang(String nama) {
        this.nama = nama;
    }
    
    public void peliharaHewan(Hewan hewanPeliharaan) {
        this.hewanPeliharaan = hewanPeliharaan;
    }
    public void ajakPeliharaanJalanJalan() {
        System.out.println("Namaku " +this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara : ");
        this.hewanPeliharaan.bergerak();
        System.out.println("-------------------------------------------");
    }
}
