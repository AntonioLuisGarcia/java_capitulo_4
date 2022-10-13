import java.util.Scanner;
public class eje18{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa te dire cual es el primer digito de un numero introducido por teclado ");
        System.out.println("Por favor, escriba un numero entero con 5 cifras como maximo ");
        int numero= sc.nextInt();
        if(numero<10){
            System.out.println("El primer digito de "+numero+" es "+numero);
        }
        if(numero>9 && numero<100){
            System.out.println("El primer digito de "+numero+" es "+numero/10);
        }
        if(numero>99 && numero<1000){
            System.out.println("El primer digito de "+numero+" es "+numero/100);
        }
        if(numero>999 && numero<10000){
            System.out.println("El primer digito de "+numero+" es "+numero/1000);
        }
        if(numero>9999 && numero<100000){
            System.out.println("El primer digito de "+numero+" es "+numero/10000);
        }
        
        sc.close();
        }
}