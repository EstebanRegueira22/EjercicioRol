
package ejerciciojuegorol;

import java.util.Random;


public class Arquero extends Jugador{
    
    Random aleatorio = new Random();
    
    private int ataque;
    private int danio;
        
    public Arquero (String nombre){        
        super(nombre);        
    }
    /**
    public int minPower(){
        this.minPower = aleatorio.nextInt(10);        
        return this.minPower;
    }
    
    
    public int maxPower(){
        this.maxPower = aleatorio.nextInt(20);        
        return this.maxPower;
    }
    **/
    
    public int atacar(){
        this.ataque = aleatorio.nextInt((20 - 1) + 1) + 1;        
        return this.ataque; 
    }
    
    public int getAtaque(){
        return ataque;
    }
    
    public int golpear (){        
        if ((this.ataque + 2) >= 20){            
            this.maxPower = aleatorio.nextInt((20 - 15)+1)+15;
            this.danio = this.maxPower;
            return this.danio;
        }
        else {            
            this.minPower = aleatorio.nextInt((10 - 5)+1)+5;
            this.danio = this.minPower;
            return this.danio;
        }        
    }
    
    public String toString(){
        String mensaje = "El jugador: " +this.nombre+ " ha hecho " +this.danio+ " de daño.";
        return mensaje;
    }
}
