
package ejerciciojuegorol;

import java.util.Random;


public class Mago {
    
    Random aleatorio = new Random();
    
    private int ataque;    
    public String nombre;
    public int vida = 100;    
    private int minPower = 10;
    private int maxPower = 25;
    
    public Mago (String nombre){
        this.nombre = nombre;
    }
    
    
    public int atacar(){
        this.ataque = aleatorio.nextInt(((20 - 1 + 1) + 1) - 1);        
        return this.ataque; 
    }
    
    public int getAtaque(){
        return ataque;
    }
    
    public int golpe (){        
        if (this.ataque >= 20){            
            return maxPower;                       
        }
        else {            
            return minPower;           
        }        
    }    
}
