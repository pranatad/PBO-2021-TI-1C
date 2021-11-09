/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise2;

/**
 *
 * @author Administrator
 */
public class Elektronik {
    public int voltase ;
    
    Elektronik() {
        voltase = 220;
    }

    public int getVoltase() {
        System.out.println("Voltase Televisi : "+voltase);
        return voltase;
    }
    
}
