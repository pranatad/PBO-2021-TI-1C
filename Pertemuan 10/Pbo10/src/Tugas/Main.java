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
public class Main {
    
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla("Gorilla", 2, "HUHUHAHA HUHUHAHA", "Hitam");
        gorilla.displayMakan();
        gorilla.displayBinatang();
        gorilla.displayData();
        
        Singa singa = new Singa("Singa", 4, "RAWR RAWR", "Kuning");
        singa.displayMakan();
        singa.displayBinatang();
        singa.displayData();
        
        Keledai keledai = new Keledai("Keledai", 4, "IHIHIHIK IHIHIHIK", "Coklat");
        keledai.displayMakan();
        keledai.displayBinatang();
        keledai.displayData();
    }
}
