import java.util.Scanner;
public class eje13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("dime tres numeros");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();
        if(numero1<numero2 && numero1<numero3 && numero2<numero3){
            System.out.print(numero1+" "+numero2+" "+numero3);
        }else{
            if(numero1<numero2 && numero1<numero3 && numero3<numero2){
                System.out.print(numero1+" "+numero3+" "+numero2);
            }else{
                if(numero2<numero1 && numero2<numero3 && numero1<numero3){
                    System.out.print(numero2+" "+numero1+" "+numero3);
                }else{
                    if(numero1>numero2 && numero3>numero2 && numero1>numero3){
                        System.out.print(numero2+" "+numero3+" "+numero1);
                    }else{
                        if(numero3<numero2 && numero1>numero3 && numero2<numero1){
                            System.out.print(numero3+" "+numero2+" "+numero1);
                        }else{
                                System.out.print(numero3+" "+numero1+" "+numero2);
                        }
                    }
                }
            }
        }
	sc.close();
    }
}