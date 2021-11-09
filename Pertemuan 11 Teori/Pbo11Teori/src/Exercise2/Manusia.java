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
public class Manusia {

    public void nyalakanTelevisi(Elektronik el) {

        if (el instanceof TelevisiJadul) {
            ((TelevisiJadul) el).getModelInput();  
            ((Elektronik) el).getVoltase();
        } else if (el instanceof TelevisiModern) {
            ((TelevisiModern) el).getModelInput();
            ((Elektronik) el).getVoltase();
        }
    }
}
