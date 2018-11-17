
package ejerciciojuegorol;


public class EjercicioJuegoRol {


    public static void main(String[] args) {
        
        int round = 1;
       
        Arquero jugador1 = new Arquero("Legolas");
        Mago jugador2 = new Mago("Gandalf");
        
        while (jugador1.vida > 0 && jugador2.vida > 0) {
            
            System.out.println("====================");
            System.out.println("Inicio del Round: " +round);            
            jugador1.atacar();
            jugador2.atacar();
            
            if (jugador1.atacar() > jugador2.atacar()){
                if (jugador1.getAtaque() >= 20){
                    System.out.println("¡Golpe Critico!");
                    }
                jugador2.vida = jugador2.vida - jugador1.golpear();
                System.out.println(jugador1.toString());                
                System.out.println("El jugador " +jugador2.nombre +" ahora tiene de vida: " + jugador2.vida);
                System.out.println("El jugador " +jugador1.nombre +" sigue con: " + jugador1.vida +" puntos de vida.");
            }           
            else {
                if (jugador2.getAtaque() >= 20){
                    System.out.println("¡Golpe Critico!");
                }
                jugador1.vida = jugador1.vida - jugador2.golpear();
                System.out.println(jugador2.toString());
                
                System.out.println("El jugador " +jugador1.nombre +" ahora tiene de vida: " + jugador1.vida);
                System.out.println("El jugador " +jugador2.nombre +" sigue con: " + jugador2.vida +" puntos de vida.");
            } 
            round = round + 1;
        }
    }    
}
