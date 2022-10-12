import java.util.Scanner;
public class eje11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dira los segundos que quedan para la medianoche");
        System.out.println("Por favor, introduzca la hora, en formato 24 horas ");
        int hora= sc.nextInt();
        System.out.println("Por favor, introduzca los minutos ");
        int min= sc.nextInt();
        int segundos;

        if(hora>24 || min>60){
            System.out.print("El valor de los datos es incorrecto");
        }else{
            segundos=(24-hora)*3600+(60-min)*60;
            System.out.print("Quedan "+segundos+" segundos");
        }
        sc.close();
        }
}