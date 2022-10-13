import java.util.Scanner;
public class eje17{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa te dire cual es el ultimo digito de un numero introducido por teclado ");
        System.out.println("Por favor, escriba un numero entero con 5 cifras como maximo ");
        int numero= sc.nextInt();
        System.out.println("El ultimo digito de "+numero+" es "+numero%10);
        
        sc.close();
        }
}