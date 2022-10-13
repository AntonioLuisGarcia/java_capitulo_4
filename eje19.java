import java.util.Scanner;

public class eje19 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa te dira cuantas cifras tiene un digito introducido por teclado");
    System.out.println("Introduzca el numero ");
    int numero = sc.nextInt();
    if(numero<0 && numero>-10 ){
        System.out.println(numero+" tiene 1 cifra");
    }
    if(numero<-9 && numero>-100){
        System.out.println(numero+" tiene 2 cifras");
    }
    if(numero<-99 && numero>-1000){
        System.out.println(numero+" tiene 3 cifras");
    }
    if(numero<-999 && numero>-10000){
        System.out.println(numero+" tiene 4 cifras");
    }
    if(numero<-9999 && numero>-100000){
        System.out.println(numero+" tiene 5 cifras");
    }
    if(numero>0 && numero<10 ){
        System.out.println(numero+" tiene 1 cifra");
    }
    if(numero>9 && numero<100){
        System.out.println(numero+" tiene 2 cifras");
    }
    if(numero>99 && numero<1000){
        System.out.println(numero+" tiene 3 cifras");
    }
    if(numero>999 && numero<10000){
        System.out.println(numero+" tiene 4 cifras");
    }
    if(numero>9999 && numero<100000){
        System.out.println(numero+" tiene 5 cifras");
    }
    if(numero>99999 || numero<-99999){
        System.out.println(numero+" tiene mas de 5 cifras");
    }
    sc.close();
    }
    }