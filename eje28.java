import java.util.Scanner;
public class eje28{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa podras jugar a piedra, papel y tijera con tus amigos");
        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugador1 = sc.next();
        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jugador2 = sc.next();
        if(jugador1.equals(jugador2)){
            System.out.print("Empate");
        }
        if(jugador1.equals("piedra") && jugador2.equals("tijera")){
            System.out.print("Gana el jugador 1"); 
        }
        if(jugador1.equals("piedra") && jugador2.equals("papel")){
            System.out.print("Gana el jugador 2"); 
        }
        if(jugador1.equals("papel") && jugador2.equals("tijera")){
            System.out.print("Gana el jugador 2"); 
        }
        if(jugador1.equals("papel") && jugador2.equals("piedra")){
            System.out.print("Gana el jugador 1"); 
        }
        if(jugador1.equals("tijera") && jugador2.equals("papel")){
            System.out.print("Gana el jugador 1"); 
        }
        if(jugador1.equals("tijera") && jugador2.equals("piedra")){
            System.out.print("Gana el jugador 2"); 
        }

        sc.close();
        }
}