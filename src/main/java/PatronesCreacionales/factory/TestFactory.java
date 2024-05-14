package PatronesCreacionales.factory;

public class TestFactory {
    public static void main(String[] args) {
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy warrior = enemyFactory.createEnemy("warrior");
        Enemy magician = enemyFactory.createEnemy("magician");
        warrior.attack();
        magician.attack();

        /*Cuando haces Enemy warrior = enemyFactory.createEnemy("warrior");, estás utilizando el principio de la
        programación orientada a objetos llamado polimorfismo.

        El polimorfismo te permite tratar objetos de clases derivadas como si fueran objetos de la clase base.
        En este caso, Warrior es una clase que implementa la interfaz Enemy, por lo que un objeto de la clase Warrior
        también se puede tratar como un objeto de tipo Enemy. Esto es posible porque la clase Warrior hereda de Enemy
        y, por lo tanto, tiene todos los métodos definidos en la interfaz Enemy, incluido attack().

        Entonces, al declarar Enemy warrior, estás diciendo que warrior es una instancia de una clase que
        implementa la interfaz Enemy, pero no necesariamente estás especificando la clase concreta (como Warrior).
        Esto te da flexibilidad en tu código, ya que podrías cambiar la implementación de Enemy sin afectar el resto
        del código que utiliza objetos Enemy.*/
    }
}
