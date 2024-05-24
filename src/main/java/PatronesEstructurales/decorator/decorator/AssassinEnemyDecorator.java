package PatronesEstructurales.decorator.decorator;

import PatronesEstructurales.decorator.Enemy;

public class AssassinEnemyDecorator extends EnemyDecorator {
    @Override
    public void attack() {
        super.attack();
        System.out.println("Assassin attack!!");
    }

    public AssassinEnemyDecorator(Enemy enemy) {
        super(enemy);
    }
}
