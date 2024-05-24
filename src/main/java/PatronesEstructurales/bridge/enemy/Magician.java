package PatronesEstructurales.bridge.enemy;

import PatronesEstructurales.bridge.fighter.Fighter;
import PatronesEstructurales.bridge.fighter.MagicianFighterImpl;

public class Magician extends Enemy {
    public Magician() {
        setFighter(new MagicianFighterImpl());
    }

    @Override
    public Fighter getFighter() {
        return super.getFighter();
    }

    @Override
    public Enemy setFighter(Fighter fighter) {
        return super.setFighter(fighter);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public Enemy setHealth(int health) {
        return super.setHealth(health);
    }


    public void attack() {
        System.out.println("magician:");
        getFighter().attack();

    }


    public void protect() {
        System.out.println("magician:");
        getFighter().protect();
    }
}
