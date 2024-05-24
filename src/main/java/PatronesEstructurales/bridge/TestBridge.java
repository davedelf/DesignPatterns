package PatronesEstructurales.bridge;


import PatronesEstructurales.bridge.enemy.Magician;
import PatronesEstructurales.bridge.enemy.Warrior;
import PatronesEstructurales.bridge.fighter.MagicianFighterImpl;
import PatronesEstructurales.bridge.fighter.WarriorFighterImpl;
/*Frase para recordar: "Separar la abstracción de la implementación"*/
public class TestBridge {
    public static void main(String[] args) {
        System.out.println("--------------------- WARRIOR ---------------------");
        Warrior warrior=new Warrior();
        warrior.attack();
        warrior.protect();
        warrior.setFighter(new MagicianFighterImpl());
        warrior.attack();
        warrior.protect();
        System.out.println("--------------------- MAGICIAN ---------------------");
        Magician magician = new Magician();
        magician.attack();
        magician.protect();
        magician.setFighter(new WarriorFighterImpl());
        magician.attack();
        magician.protect();
    }
}
