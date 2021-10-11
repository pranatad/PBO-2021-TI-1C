/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan2;

/**
 *
 * @author Pranata
 */
public class ClassB extends ClassA {
    public int z;

    public void setZ(int z) {
        this.z = z;
    }
    
    public void getNilaiZ() {
        System.out.println("Nilai z: " +z);
    }
    
    public void getJumlah() {
        System.out.println("Jumlah: " +(x+y+z));
    }

}
