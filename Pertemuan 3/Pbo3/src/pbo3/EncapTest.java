/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3;

/**
 *
 * @author Pranata
 */
public class EncapTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EncapDemo encap = new EncapDemo();
        EncapDemo encap2 = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);
        encap2.setName("Bond");
        encap2.setAge(17);
        
        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
        System.out.println("Name : " + encap2.getName());
        System.out.println("Age : " + encap2.getAge());
    }
    
}
