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
public class Barrier implements Destroyable {

    private int strength;

    Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getBarrierInfo() {
        return "\nBarrier Strength = " + getStrength();
    }

    @Override
    public void destroyed() {
        strength = (strength - 2 / 100 * strength);
    }
}
