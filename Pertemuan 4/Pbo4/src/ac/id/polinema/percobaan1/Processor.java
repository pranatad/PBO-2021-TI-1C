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
public class Processor {
    private String merk;
    private double cache;
    
    Processor() {
        
    }
    
    Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }
    public void info() {
        System.out.println("Merk Processor = "+ merk);
        System.out.println("Cache Memory = "+ cache);
    }
}
