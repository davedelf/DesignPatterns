package PatronesCreacionales.prototype;

public class TestPrototype{
    public static void main(String[] args) {
    /*Enemy enemy1=new Enemy(100,100);
    Enemy enemy2=enemy1;
    Enemy enemy3=enemy1;

        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(enemy3);
        System.out.println("------------------------");
        enemy2.setHealth(0);
        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(enemy3);*/

        /*Vemos que no funciona, ya que en definitiva es el mismo objeto solo que con
        * 3 nombres, es decir, misma dirección de memoria. Distinto sería si usaramos
        * new Enemy()
        *
        * Lo optimo es tener un método enemy.clone() el cual creará una copia del objeto
        * creado en una nueva variable u objeto, pero con las mismas inicializaciones de
        * sus atributos, que luego pueden ser modificadas manualmente. Es decir, se clona o
        * crea un nuevo objeto a partir de uno existente y se le asigna un espacio en memoria,
        * por lo que serán objetos manipulables independientemente.
        *
        * Algo interesante de este patrón es que tiene un contructor que se pasa a si mismo
        * como parámetro, algo similar al patrón singleton*/

        Warrior warrior1=new Warrior(100,100,100);
        Warrior warrior2= (Warrior) warrior1.clone();
        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println("----------------------------------------------");
        warrior2.setHealth(0);
        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println("----------------------------------------------");
        Magician magician1=new Magician(100,100,100);
        Magician magician2= (Magician) magician1.clone();
        System.out.println(magician1);
        System.out.println(magician2);
        System.out.println("----------------------------------------------");
        magician2.setHealth(0);
        System.out.println(magician1);
        System.out.println(magician2);
    }
}
