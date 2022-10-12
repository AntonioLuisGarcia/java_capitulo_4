import java.util.Scanner;

public class eje14{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("dime un numero y te dire si acaba en cinco");
        int numero = sc.nextInt();
        if(numero%2==0 && numero%5==0 ){
            System.out.print(numero+" es par y divisible entre cinco");
        }else{
            if(numero%5==0){
            System.out.print(numero+" es divisible entre cinco");
            }else{
                if(numero%2==0){
                System.out.print(numero+" es par"); 
                }
            }
        }
	sc.close();
    
    }
}