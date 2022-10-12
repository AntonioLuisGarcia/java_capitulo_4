import java.util.Scanner;
public class eje12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te hara un miniexamen");
        System.out.println("Intente hacertar todas las preguntas para sacar la maxima puntacion");      
        int total=0;
        System.out.println("¿Cuanto es 1+1?");
        System.out.println("a)1. b)2. c)0.");
        String respuesta1=sc.next();
        if(respuesta1.equals("b")){
            total++;
        }
        System.out.println("¿Cuanto es 2x2?");
        System.out.println("a)1. b)2. c)4.");
        String respuesta2=sc.next();
        if(respuesta2.equals("c")){
            total++;
        }
        System.out.println("¿Cuanto es 5-3?");
        System.out.println("a)1. b)2. c)4.");
        String respuesta3=sc.next();
        if(respuesta3.equals("b")){
            total++;
        }
        System.out.println("¿Cuanto es 58-35?");
        System.out.println("a)10. b)23. c)15.");
        String respuesta4=sc.next();
        if(respuesta4.equals("b")){
            total++;
        }
        System.out.println("¿Cuanto es 25x6?");
        System.out.println("a)175. b)150. c)300.");
        String respuesta5=sc.next();
        if(respuesta5.equals("b")){
            total++;
        }
        System.out.println("¿Cuanto es 45/5?");
        System.out.println("a)10. b)7. c)9.");
        String respuesta6=sc.next();
        if(respuesta6.equals("c")){
            total++;
        }
        System.out.println("¿Cuanto es 9+5+6-7?");
        System.out.println("a)12. b)10. c)13.");
        String respuesta7=sc.next();
        if(respuesta7.equals("c")){
            total++;
        }
        System.out.println("¿Cuanto es 5*4-6?");
        System.out.println("a)14. b)20. c)15.");
        String respuesta8=sc.next();
        if(respuesta8.equals("a")){
            total++;
        }
        System.out.println("¿Cuanto es 81/9+5-8?");
        System.out.println("a)6. b)9. c)3.");
        String respuesta9=sc.next();
        if(respuesta9.equals("a")){
            total++;
        }
        System.out.println("¿Cuanto es (4+6-9)*(5*3)?");
        System.out.println("a)43. b)21. c)15.");
        String respuesta10=sc.next();
        if(respuesta10.equals("c")){
            total++;
        }
        System.out.println("Has sacado un "+total);
        sc.close();
        
    }
}