package adapter;

/*Por lo general traigo una clase o varias clases que vienen de otro proyecto
* y no están pensadas para el actual, entonces creamos una clase intermedia
* que lo que hace es implementar la interfaz que implementa las otra clases del
* proyecto. Creamos en esa clase intermedia un atributo del tipo de la clase
* que vamos a adaptar, creamos / adaptamos los métodos y finalmente en el
* constructor de la clase intermedia o adaptadora inicializamos el objeto adaptado*/
public class TestAdapter {
    public static void main(String[] args) {
        ZombieAdapter zombie=new ZombieAdapter();
        zombie.attack();
        zombie.damage();
    }
}
