import java.util.Scanner;
public class eje20{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa te dire si un numero introducido por teclado es capicua ");
        System.out.println("Por favor, escriba un numero entero con 5 cifras como maximo ");
        int numero= sc.nextInt();
        if(numero>= 0 && numero<10){
            System.out.print("Es capicua");
        }
        if(numero>= 10 && numero<100 && numero/10== numero%10){
            System.out.print("Es capicua");
        }
        if(numero>= 100 && numero<1000 && numero/100==numero%10){
            System.out.print("Es capicua");
        }
        if(numero>= 1000 && numero<10000 && numero%1000 == numero%10 && (numero/100)%10==(numero%100)/10){
            System.out.print("Es capicua");
        }
        if(numero>= 10000 && numero<100000 && numero%10000 == numero%10 && (numero/1000)%10==(numero%100)/10){
            System.out.print("Es capicua");
        }


        sc.close();
        }
}