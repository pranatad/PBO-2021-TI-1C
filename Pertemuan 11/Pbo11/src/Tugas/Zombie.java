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
public class Zombie implements Destroyable {
    public int health;
    public int level;
    
    public void heal() {
        
    }
    @Override
    public void destroyed() {
        
    }
    public String getZombieInfo() {
        return "Health = "+health+
                "\nLevel = "+level;
    }
}
