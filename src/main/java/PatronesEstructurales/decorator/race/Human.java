package PatronesEstructurales.decorator.race;

import PatronesEstructurales.decorator.Enemy;

public class Human implements Enemy {
    @Override
    public void attack() {
        System.out.println("Human attack!!");
    }
}
