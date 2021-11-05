/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author Pranata
 */
public class interfacemain {
    public static void main(String[] args) {
        
    
    Rektor pakrektor = new Rektor();
    
    //Mahasiswa mhsBiasa = new Mahasiswa("Pranata");
    Sarjana sarjanaCumlaude = new Sarjana("Dito");
    PascaSarjana masterCumlaude = new PascaSarjana("Fitriyansyah");
    
   pakrektor.berSertifikatCumlaude(sarjanaCumlaude);
   pakrektor.berSertifikatCumlaude(masterCumlaude);
   
   
}
}
