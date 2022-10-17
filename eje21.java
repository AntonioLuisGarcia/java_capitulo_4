import java.util.Scanner;
public class eje21{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa te dire si eres apto o no en la asignatura de programacion ");
        System.out.println("Por favor, introduzca su primera nota ");
        int examen1= sc.nextInt();
        System.out.println("Por favor, introduzca su segunda nota ");
        int examen2= sc.nextInt();
        double media= (examen1+examen2)/2;
        System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
        if(media<5){
            System.out.println("No eres apto");
        }else{
            System.out.println("Eres apto");
        }
        System.out.print("Tu noata es : ");
        System.out.print(media);

        sc.close();
        }
}