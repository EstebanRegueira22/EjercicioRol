
package ejerciciojuegorol;


public abstract class Jugador {
    
    public String nombre;
    public int vida = 100;    
    public int minPower;
    public int maxPower;
    public int danio;
    
    public Jugador (String nombre){
        
        this.nombre = nombre;
        
    }
    
    public abstract int atacar();
    
    public abstract int golpear();
    
    /**
    public abstract int minPower();
    
    public abstract int maxPower();
    
   **/
    
    
}
