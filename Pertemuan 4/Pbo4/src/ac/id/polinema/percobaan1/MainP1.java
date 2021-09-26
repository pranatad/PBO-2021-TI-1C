/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.id.polinema.percobaan1;

/**
 *
 * @author Pranata
 */
public class MainP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Processor p1 = new Processor("Intel i5", 3);
        Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3));
        
        l.info();
    }
    
}
