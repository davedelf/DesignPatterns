package PatronesCreacionales.abstractFactory.factory;

import PatronesCreacionales.abstractFactory.armor.Armor;
import PatronesCreacionales.abstractFactory.armor.HeavyArmor;
import PatronesCreacionales.abstractFactory.enemy.Enemy;
import PatronesCreacionales.abstractFactory.enemy.Warrior;
import PatronesCreacionales.abstractFactory.weapon.Axe;
import PatronesCreacionales.abstractFactory.weapon.Weapon;

public class WarriorFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Axe();
    }
}
