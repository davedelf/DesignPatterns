package PatronesCreacionales.abstractFactory.factory;


import PatronesCreacionales.abstractFactory.armor.Armor;
import PatronesCreacionales.abstractFactory.enemy.Enemy;
import PatronesCreacionales.abstractFactory.weapon.Weapon;

public abstract class EnemyAbstractFactory {
    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();

}
