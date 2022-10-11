import java.util.Scanner;
public class eje2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("¿Que hora es? ");
        int hora= sc.nextInt();
        if(hora<=12 && hora>=6){
            System.out.print("Buenos Dias");
        }else{
            if(hora>=13 && hora<=20){
                System.out.print("Buenas tardes");
            }else{
                System.out.print("Buenas noches");
            }
        }
        sc.close();
        }
}