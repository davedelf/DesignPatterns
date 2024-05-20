package PatronesCreacionales.builder;

import lombok.Builder;

/*Builder se presenta en el caso de los constructores, cuando necesitamos
 * crear objetos con algunos atributos y no todos, y esto sirve
 * para evitar sobrecarga de constructor, es decir, crear más de un contructor
 * con un parámetro para cada atributo y/o combinaciones de ellos.
 * Se basa en el enfoque de que no todos los atributos son obligatorios, o en
 * que todos son obligatorios por lo que tendríamos que crear un super constructor
 * con todos los parámetros para cada atributo.
 *
 * Para crear este patrón podemos usar la notación @Builder de la dependencia Lombok pero
 * en este ejemplo lo desarrollamos manualmente.
 *
 * El único inconveniente de este patrón es que tenemos que duplicar las clases.
 */

public class Enemy {
    // private int age;
    // private String name;
    // private String email;

    // public Enemy() {

    // }

    // public Enemy(int age) {
    //     this.age = age;
    // }

    // public Enemy(String name) {
    //     this.name = name;
    // }

    // public Enemy(int age, String name) {
    //     this.age = age;
    //     this.name = name;
    // }


    private String name;
    private String type;
    private int health;
    private int damage;
    private int endurance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public static EnemyBuilder builder(){
        return  new EnemyBuilder();
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                ", endurance=" + endurance +
                '}';
    }
}
