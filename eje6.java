import java.util.Scanner;
public class eje6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("A que altura esta el objeto en metros ");
        float h= sc.nextFloat();
        float dosh= 2*h;
        double t = Math.sqrt(dosh/9.81); 
        if(h<0){
            System.out.print("La altura no puede ser negativa pruebe de nuevo");
        }else{
        System.out.print("El tiempo es de "+String.format("%.2f",t)+" segundos");
        sc.close();
        }
        }
}