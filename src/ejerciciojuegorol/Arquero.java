
package ejerciciojuegorol;

import java.util.Random;


public class Arquero{
    
    Random aleatorio = new Random();
    
    private int ataque;    
    public String nombre;
    public int vida = 100;    
    private int minPower = 5;
    private int maxPower = 15;
    
    public Arquero (String nombre){
        this.nombre = nombre;
    }
    
    
    public int atacar(){
        this.ataque = aleatorio.nextInt((20 - 1 + 1) + 1) + 3;        
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
