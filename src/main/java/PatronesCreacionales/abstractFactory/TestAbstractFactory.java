package PatronesCreacionales.abstractFactory;

import PatronesCreacionales.abstractFactory.armor.Armor;
import PatronesCreacionales.abstractFactory.enemy.Enemy;
import PatronesCreacionales.abstractFactory.factory.EnemyAbstractFactory;
import PatronesCreacionales.abstractFactory.factory.MagicianFactory;
import PatronesCreacionales.abstractFactory.factory.WarriorFactory;
import PatronesCreacionales.abstractFactory.weapon.Weapon;

public class TestAbstractFactory {
    public static void main(String[] args) {

        EnemyAbstractFactory factory=new WarriorFactory();
        Enemy warrior=factory.createEnemy();
        Armor heavyArmor=factory.createArmor();
        Weapon axe=factory.createWeapon();
        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        factory=new MagicianFactory();
        Enemy magician=factory.createEnemy();
        Armor robe=factory.createArmor();
        Weapon wizardStaff=factory.createWeapon();
        magician.attack();
        robe.protect();
        wizardStaff.damage();
    }
}
