import java.util.Scanner;
public class eje5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0 ");
        System.out.println("Por favor, introduzca el valor de a: ");
        double a= sc.nextDouble();
        System.out.println("Por favor, introduzca el valor de b: ");
        double b= sc.nextDouble();
        double x = b*-1/a; 
        System.out.print("El valor de x es "+String.format("%.2f",x));
        sc.close();
        }
}