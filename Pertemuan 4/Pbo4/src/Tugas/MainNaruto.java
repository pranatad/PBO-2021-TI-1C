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
public class MainNaruto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=================UZUMAKI NARUTO RELATIONSHIP=================");

        OrangTua ortu = new OrangTua("Namikaze Minato", 24, "Laki-Laki");

        Guru guru = new Guru("Jiraiya", 54, "Laki-Laki");
        AnggotaTujuh anggota = new AnggotaTujuh("Haruno Sakura", 17, "Perempuan");
        Teman teman = new Teman("Hinata Hyuga", 16, "Perempuan");
        Naruto naruto = new Naruto("Uzumaki Naruto", ortu, guru, anggota, teman);
        System.out.println(naruto.info());
        
        // cara 2
        //OrangTua ortu2 = new OrangTua("Uzumaki Kushina", 24, "Perempuan");
        //Guru guru2 = new Guru("Hatake Kakashi" , 31, "Laki-Laki");
        //AnggotaTujuh anggota2 = new AnggotaTujuh("Sai" , 17, "Laki-Laki");
        //Teman teman2 = new Teman("Shikamaru Nara" , 17, "Laki-Laki");
        //System.out.println(ortu2.info() +guru2.info() +anggota2.info() +teman2.info());
    }
}
