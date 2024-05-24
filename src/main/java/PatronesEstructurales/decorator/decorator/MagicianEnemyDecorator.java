package PatronesEstructurales.decorator.decorator;

import PatronesEstructurales.decorator.Enemy;

public class MagicianEnemyDecorator extends EnemyDecorator {
    @Override
    public void attack() {
        super.attack();
        System.out.println("Magician attack!!");
    }

    public MagicianEnemyDecorator(Enemy enemy) {
        super(enemy);
    }
}
