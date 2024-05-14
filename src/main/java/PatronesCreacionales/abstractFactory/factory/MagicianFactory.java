package PatronesCreacionales.abstractFactory.factory;

import PatronesCreacionales.abstractFactory.armor.Armor;
import PatronesCreacionales.abstractFactory.armor.Robe;
import PatronesCreacionales.abstractFactory.enemy.Enemy;
import PatronesCreacionales.abstractFactory.enemy.Magician;
import PatronesCreacionales.abstractFactory.weapon.Weapon;
import PatronesCreacionales.abstractFactory.weapon.WizardStaff;

public class MagicianFactory extends EnemyAbstractFactory{
    @Override
    public Enemy createEnemy() {
        return new Magician();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new WizardStaff();
    }
}
