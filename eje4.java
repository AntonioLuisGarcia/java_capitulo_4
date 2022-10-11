import java.util.Scanner;
public class eje4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas horas has trabajdo? ");
        int horas= sc.nextInt();
        if(horas<41 ){
            System.out.print("Su sueldo es de: "+ horas*12);
        }else{
            int sueldoextra= ((horas-40)*16)+480;
            System.out.print("Su sueldo es de: "+ sueldoextra);
        }
        sc.close();
        }
}