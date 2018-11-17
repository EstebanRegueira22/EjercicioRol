
package ejerciciojuegorol;

import java.util.Random;


public class Guerrero extends Jugador{
    
   Random aleatorio = new Random();
    
    private int ataque;
    private int danio;
    
    public Guerrero (String nombre){
        
        super(nombre);
        
    }
    
    public int atacar(){
        this.ataque = aleatorio.nextInt((20 - 1) + 1) + 1;        
        return this.ataque; 
    }
    
    public int getAtaque(){
        return ataque;
    }
    
    public int golpear (){        
        if ((this.ataque + 1) >= 20){            
            this.maxPower = aleatorio.nextInt((20 - 17)+1)+17;
            this.danio = this.maxPower;
            return this.danio;
        }
        else {            
            this.minPower = aleatorio.nextInt((15 - 8)+1)+8;
            this.danio= this.minPower;
            return this.danio;
        }        
    }
    
    public String toString(){
        String mensaje = "El jugador: " +this.nombre+ " ha hecho " +this.danio+ " de daño.";
        return mensaje;
    }
}
