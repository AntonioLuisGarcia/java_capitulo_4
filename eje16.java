import java.util.Scanner;
public class eje16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dira si tu pareja te es infiel");
        System.out.println("Contesta a las siguientes preguntas tipo test");      
        int total=0;
        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente");
        System.out.println("a)Si. b)No.");
        String respuesta1=sc.next();
        if(respuesta1.equals("a")){
            total++;
        }
        System.out.println("Ha aumentado sus gastos de vestuario");
        System.out.println("a)Si. b)No.");
        String respuesta2=sc.next();
        if(respuesta2.equals("a")){
            total++;
        }
        System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
        System.out.println("a)Si. b)No.");
        String respuesta3=sc.next();
        if(respuesta3.equals("a")){
            total++;
        }
        System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombreo ahora se arregla el pelo y se asea con más frecuencia (si es mujer)");
        System.out.println("a)Si. b)No.");
        String respuesta4=sc.next();
        if(respuesta4.equals("a")){
            total++;
        }
        System.out.println("No te deja que mires la agenda de su teléfono móvil");
        System.out.println("a)Si. b)No.");
        String respuesta5=sc.next();
        if(respuesta5.equals("a")){
            total++;
        }
        System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
        System.out.println("a)Si. b)No.");
        String respuesta6=sc.next();
        if(respuesta6.equals("a")){
            total++;
        }
        System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
        System.out.println("a)Si. b)No.");
        String respuesta7=sc.next();
        if(respuesta7.equals("a")){
            total++;
        }
        System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
        System.out.println("a)Si. b)No.");
        String respuesta8=sc.next();
        if(respuesta8.equals("a")){
            total++;
        }
        System.out.println("Has notado que últimamente se perfuma más");
        System.out.println("a)Si. b)No.");
        String respuesta9=sc.next();
        if(respuesta9.equals("a")){
            total++;
        }
        System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
        System.out.println("a)Si. b)No.");
        String respuesta10=sc.next();
        if(respuesta10.equals("a")){
            total++;
        }

        if(total<4){
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel");
        }
        if(total<7){
            System.out.println(" Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        }
        if(total>=7){
        System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }
        sc.close();
        
    }
}