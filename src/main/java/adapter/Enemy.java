package adapter;
/*Lo que permite es adaptar una clase que viene de otro proyecto a otro proyecto
* es decir, nos ahorramos tener que volver a escribir el código y simplemente
* adaptarla al proyecto en cuestión. Tenemos dos opciones para una clase, o adaptarla
* o volver a escribirla. Es decir, permite la reutilización de código.
*
* "Como cuando vas a Europa, para cargar el celu necesitas un adaptador en lugar
* de volver a comprar el cargador" Esto es similar, la clase sería el cargador,
* el tomacorrientes el proyecto el el adaptador del tomacorrientes el patron adapter*/
public interface Enemy {
    void attack();
    void damage();

}
