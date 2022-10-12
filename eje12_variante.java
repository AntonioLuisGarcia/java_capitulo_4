import java.util.Scanner;
public class eje12_variante{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te hara un miniexamen");
        System.out.println("Intente hacertar todas las preguntas para sacar la maxima puntacion");      
        int total=0;
        System.out.println("¿Cuanto es 1+1?");
        int respuesta1=sc.nextInt();
        if(respuesta1==2){
            total++;
        }
        System.out.println("¿Cuanto es 2x2?");
        int respuesta2=sc.nextInt();
        if(respuesta2==4){
            total++;
        }
        System.out.println("¿Cuanto es 5-3?");
        int respuesta3=sc.nextInt();
        if(respuesta3==2){
            total++;
        }
        System.out.println("¿Cuanto es 58-35?");
        int respuesta4=sc.nextInt();
        if(respuesta4==23){
            total++;
        }
        System.out.println("¿Cuanto es 25x6?");
        int respuesta5=sc.nextInt();
        if(respuesta5==150){
            total++;
        }
        System.out.println("¿Cuanto es 45/5?");
        int respuesta6=sc.nextInt();
        if(respuesta6==9){
            total++;
        }
        System.out.println("¿Cuanto es 9+5+6-7?");
        int respuesta7=sc.nextInt();
        if(respuesta7==13){
            total++;
        }
        System.out.println("¿Cuanto es 5*4-6?");
        int respuesta8=sc.nextInt();
        if(respuesta8==14){
            total++;
        }
        System.out.println("¿Cuanto es 81/9+5-8?");
        int respuesta9=sc.nextInt();
        if(respuesta9==6){
            total++;
        }
        System.out.println("¿Cuanto es (4+6-9)*(5*3)?");
        int respuesta10=sc.nextInt();
        if(respuesta10==15){
            total++;
        }

        System.out.println("Has sacado un "+total);
        sc.close();
        
    }
}