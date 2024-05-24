package PatronesEstructurales.decorator.decorator;

import PatronesEstructurales.decorator.Enemy;

public class WarriorEnemyDecorator extends EnemyDecorator{

    @Override
    public void attack() {
        super.attack();
        System.out.println("Warrior attack!!");
    }

    public WarriorEnemyDecorator(Enemy enemy) {
        super(enemy);
    }
}
