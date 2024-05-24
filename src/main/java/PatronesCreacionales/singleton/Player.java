package PatronesCreacionales.singleton;
/*Es un patrón muy simple y se caracteriza por dos cosas principalmente:
* El o los constructores que tenga van a ser privados
* Va a tener un campo estático de su propia clase
*
* Aunque sea un patrón simple y tentativo de usar, en ciertos escenarios puede
* considerarse un antipatrón ya que puede traer consecuencias, por ejemplo
* en el tiempo de vida de los servicios, etc.*/
public class Player {
    private String name;
    private volatile static Player player;

    private Player (String name){
        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        this.name = name;
    }

    public synchronized static Player getPlayer(String name){
        if(player ==null){
            player=new Player(name);
        }
        return player;

        /*Lo incializamos una única ves y entonces retornará el mismo
        * objeto con el mismo nombre, es por ello que se realiza la
        * validación de si es nulo o no. Si es nulo entonces se inicializa,
        * de lo contrario se devuelve el ya inicializado, es decir, el primer
        * y único objeto-instancia creada de la clase.*/
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }
}
