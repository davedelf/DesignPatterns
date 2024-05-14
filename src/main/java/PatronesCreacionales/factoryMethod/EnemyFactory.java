package PatronesCreacionales.factoryMethod;

/*Este caso de factory methos lo utilizamos para evitar varios if-else anidados o switch en el caso de que la clase
* padre tenga varias clases derivadas.*/

public abstract class EnemyFactory {

    public abstract Enemy createEnemy();
}
