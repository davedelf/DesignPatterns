package PatronesCreacionales.singleton;

public class TestSingleton
{
    public static void main(String[] args) {
        Player player=Player.getPlayer("Pepe");
        System.out.println(player);
        player=Player.getPlayer("Manolo");
        System.out.println(player);

        /*Aunque le llamemos Manolo seguirá siendo Pepe.
        *
        * Este patrón da problemas en los siguientes escenarios:
        * En los ClassLoader: Un ClassLoader es un contenedor donde se
        * cargan todas las clases que va a utilizar el programa. Nos arrojará
        * ClassNotFoundException, esto quiere decir que el ClassLoader no encuentra
        * una clase que estemos llamando o instanciando. Cada programa tiene su
        * propio ClassLoader. Por más que cada programa tenga su propio ClassLoader
        * existen ciertos escenarios en los que pueden tener variables en común, es
        * decir compartir una variable. Acá es donde se genera conflicto con el singleton
        *
        * El caso problemático más común se da en la "programación multihilo:
        * Para evitar el problema lo que tenemos que hacer es marcar el campo estático
        * como volatile y el getPlayer como synchronized".
        *
        *¿Qué significa volatile? Hoy en día los procesadores tienen varios nucleos
        * y cada nucleo su propia memoria cache. Cada hilo se ejecuta en un nucleo,
        * entonces lo que hace ese nucleo es cargar las variables, entonces dos hilos
        * que estén apuntando a la variable singleton van a tener valores diferentes
        * porque cada uno tiene su copia. Lo que hace volatile es que no se guarden
        * las variables en la memoria cache sino que las guarde en la memoria RAM, de
        * este modo todos los hilos van a apuntar a la misma dirección de memoria, ya que
        * es una memoria compartida.
        * */

        Thread threadPepe=new Thread(new RunPepe());
        Thread threadManolo=new Thread(new RunManolo());
        threadPepe.start();
        threadManolo.start();
    }


    static class RunPepe implements Runnable{

        @Override
        public void run() {
            Player player=Player.getPlayer("Pepe");
            System.out.println("Running pepe: "+player);
        }
    }

    static class RunManolo implements Runnable{
        @Override
        public void run(){
            Player player=Player.getPlayer("Manolo");
            System.out.println("Running Manolo: "+player);
        }
    }
}
