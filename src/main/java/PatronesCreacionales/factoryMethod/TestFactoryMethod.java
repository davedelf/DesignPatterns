package PatronesCreacionales.factoryMethod;

public class TestFactoryMethod {
    public static void main(String[] args) {
        Enemy warrior=new WarriorFactory().createEnemy();
        Enemy magician=new MagicianFactory().createEnemy();
        warrior.attack();
        magician.attack();
    }
}
