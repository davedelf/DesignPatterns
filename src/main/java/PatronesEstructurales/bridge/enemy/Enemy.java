package PatronesEstructurales.bridge.enemy;

import PatronesEstructurales.bridge.fighter.Fighter;

public abstract class Enemy {
    protected int health;
    protected Fighter fighter;

    public int getHealth() {
        return health;
    }

    public Enemy setHealth(int health) {
        this.health = health;
        return this;
    }

    public Fighter getFighter() {
        return fighter;
    }

    public Enemy setFighter(Fighter fighter) {
        this.fighter = fighter;
        return this;
    }
}
