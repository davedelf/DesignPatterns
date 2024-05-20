package PatronesCreacionales.prototype;

/*Este patrón consiste en tener la posibilidad de copiar o clonar el mismo objeto
 * sin tener que escribir varias veces el mismo código*/

/*En este caso marcamos la clase como abstracta porque existen sus clases hijas Magician
* y Warrior*/
public abstract class Enemy {
    /*Colocamos los atributos como protected para que las clases hijas puedan acceder
    * a ellos y así mostrarlos en el método toString()*/
    protected int health;
    protected int damage;

    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    /*Constructor que se pasa a si mismo como parámetro*/
    public Enemy (Enemy enemy){
        if(enemy!=null){
            setHealth(enemy.getHealth());
            setDamage(enemy.getDamage());
        }
    }

    /*Método abstracto que cada hija deberá implementar a su manera y que es obligatorio*/
    public abstract Enemy clone();
    public int getHealth() {
        return health;
    }

    public Enemy setHealth(int health) {
        this.health = health;
        return this;
    }

    public int getDamage() {
        return damage;
    }

    public Enemy setDamage(int damage) {
        this.damage = damage;
        return this;
    }


}
