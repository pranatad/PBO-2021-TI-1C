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
public class Program {
    
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan ikanCupang = new Ikan();
        
        Orang pranata = new Orang("Pranata");
        Orang dito = new Orang("Dito");
        
        pranata.peliharaHewan(kucingKampung);
        dito.peliharaHewan(ikanCupang);
        
        pranata.ajakPeliharaanJalanJalan();
        dito.ajakPeliharaanJalanJalan();    
    }
}
