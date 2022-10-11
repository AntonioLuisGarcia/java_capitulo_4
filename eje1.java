import java.util.Scanner;
public class eje1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Dime un dia de la semana ");
        int dia= sc.nextInt();
        switch(dia){
            case 1:
            System.out.print("Programacion");
            break;
            case 2:
            System.out.print("Sistemas ");
            break;
            case 3:
            System.out.print("Entornos de desarrollo");
            break;
            case 4:
            System.out.print("Programacion");
            break;
            case 5:
            System.out.print("FOL");
            break;
            case 6:
            System.out.print("No hay clase");
            break;
            case 7:
            System.out.print("No hay clase");
            break;
        }
        sc.close();
        }
}