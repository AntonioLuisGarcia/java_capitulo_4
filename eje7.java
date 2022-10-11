import java.util.Scanner;
public class eje7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Dime la nota de tu primer examen ");
        float e1= sc.nextFloat();
        System.out.println("Dime la nota de tu segundo examen ");
        float e2= sc.nextFloat();
        System.out.println("Dime la nota de tu tercer examen ");
        float e3= sc.nextFloat();
        float media= (e1 + e2 + e3)/3;
        if(e1<0 || e2<0 || e3<0 || e1>10 || e2>10 || e3>10){
            System.out.print("Algun digito no es correcto pruebe de nuevo");
        }else{
        System.out.print("Tu media es "+String.format("%.2f",media));
        }
        sc.close();
        }
}