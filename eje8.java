import java.util.Scanner;
public class eje8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Dime la nota de tu primer examen ");
        float e1= sc.nextFloat();
        System.out.println("Dime la nota de tu segundo examen ");
        float e2= sc.nextFloat();
        System.out.println("Dime la nota de tu tercer examen ");
        float e3= sc.nextFloat();
        float media= (e1 + e2 + e3)/3;
        System.out.println("Tu media es "+String.format("%.2f",media));
        if(media<5){
            System.out.print("Insuficiente");
        }
        if(media>=5 && media<6){
            System.out.print("Suficiente");
        }
        if(media>=6 && media<7){
            System.out.print("Bien");
        }
        if(media<9 && media>=7){
            System.out.print("Notable");
        }
        if(media>9){
            System.out.print("Sobresaliente");
        }
        sc.close();
        }
}