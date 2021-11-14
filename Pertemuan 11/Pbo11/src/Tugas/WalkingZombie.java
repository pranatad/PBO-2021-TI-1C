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
public class WalkingZombie extends Zombie implements Destroyable {

    WalkingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }

    @Override
    public void heal() {
        int level = 0;
        switch (level) {
            case '1':
                health = health + (10 / 100);
                break;
            case '2':
                health = health + (30 / 100);
                break;
            case '3':
                health = health + (40 / 100);
                break;
        }
    }

    @Override
    public void destroyed() {
        health = health - (health * 20/100);
    }

    @Override
    public String getZombieInfo() {
        String info = super.getZombieInfo() + "\n";
        System.out.println("Walking Zombie Data = ");
        //return "Health = " + health
        // + "\nLevel = " + level;
        super.destroyed();
        return info;
        
    }
}
