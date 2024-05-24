package PatronesEstructurales.decorator;

import PatronesEstructurales.decorator.decorator.AssassinEnemyDecorator;
import PatronesEstructurales.decorator.decorator.MagicianEnemyDecorator;
import PatronesEstructurales.decorator.decorator.WarriorEnemyDecorator;
import PatronesEstructurales.decorator.race.Elf;
import PatronesEstructurales.decorator.race.Human;

public class TestDecorator {
    public static void main(String[] args) {
        /*Acá vemos lo de las muñecas Matroska, una clase dentro de otra clase y dentro de otra clase*/
        System.out.println("---------- Human Warrior ----------");
        Enemy humanWarrior=new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();
        System.out.println("---------- Human Warrior Magician ----------");
        Enemy humanWarriorMagician=new WarriorEnemyDecorator(new MagicianEnemyDecorator(new Human()));
        humanWarriorMagician.attack();
        System.out.println("---------- Elf Warrior Magician Assassin ----------");
        Enemy elfHumanWarriorAssassin=new AssassinEnemyDecorator(new MagicianEnemyDecorator(new WarriorEnemyDecorator(new Elf())));
        elfHumanWarriorAssassin.attack();
    }
}
