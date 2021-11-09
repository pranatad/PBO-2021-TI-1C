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
public class TelevisiJadul extends Elektronik {
    private String modelInput;
    
    TelevisiJadul() {
        modelInput = "DVI";
    }

    public String getModelInput() {
        System.out.println("Nyalakan televisi jadul dengan input: " +modelInput);
        return modelInput;
    }
    
}
