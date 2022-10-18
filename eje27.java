//Ejercicio 27
/*Una pastelería nos ha pedido realizar un programa que haga presupuestos de
tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
nombre; la nata suma 2.50 y la escritura del nombre 2.75.

Ejemplo 1:
Elija un sabor (manzana, fresa o chocolate): chocolate
¿Qué tipo de chocolate quiere? (negro o blanco): negro
¿Quiere nata? (si o no): si
¿Quiere ponerle un nombre? (si o no): no
Tarta de chocolate negro: 14,00 €
Con nata: 2,50 €
Total: 16,50 €

Ejemplo 2:
Elija un sabor (manzana, fresa o chocolate): manzana
¿Quiere nata? (si o no): no
¿Quiere ponerle un nombre? (si o no): si
Tarta de manzana: 18,00 €
Con nombre: 2,75 €
Total: 20,75 €

Ejemplo 3:
Elija un sabor (manzana, fresa o chocolate): fresa
¿Quiere nata? (si o no): si
¿Quiere ponerle un nombre? (si o no): si
Tarta de fresa: 16,00 €
Con nata: 2,50 €
Con nombre: 2,75 €
Total: 21,25 */


import java.util.Scanner;
public class eje27{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa hare el presupuesto de una tienda de tartas ");
        System.out.println("¿Que sabor de helado quieres? ");
        System.out.println("1.Chocolate  2.Manzana  3.Fresa ");
        int sabor= sc.nextInt();
        
        switch(sabor){
            case 1:
            System.out.println("¿Que chocolate quieres? ");
            System.out.println("1.Negro  2.Blanco ");
            int choco= sc.nextInt();
            System.out.println("¿Quieres nata? ");
            System.out.println("1.Si  2.No ");
            int nata=sc.nextInt();
            System.out.println("¿Quieres poner nombre? ");
            System.out.println("1.Si  2.No ");
            int respuesta_nombre=sc.nextInt();
            switch(respuesta_nombre){
                case 1:
                    switch(choco){
                        case 1:
                        System.out.println("Tarta de chocolate negro:14.00$");
                        if(nata==1){
                            System.out.println("Con nata: 2.50$");
                            System.out.println("Con nombre: 2.75$");
                            System.out.println("Total:19.25$");
                        }else{
                            System.out.println("Con nombre: 2.75$");
                            System.out.println("Total:16.75$");
                        }
                        break;

                        case 2:
                        System.out.println("Tarta de chocolate blanco:15.00$");
                        if(nata==1){
                            System.out.println("Con nata: 2.50$");
                            System.out.println("Con nombre: 2.75$");
                            System.out.println("Total: 20.25$");
                        }else{
                            System.out.println("Con nombre: 2.75$");
                            System.out.println("Total:17.75$");
                        }
                        break;
                        
                    }
                    break;
                case 2:
                    System.out.println("Tarta de chocolate negro:14.00$");
                    if(nata==1){
                        System.out.println("Con nata: 2.50$");
                        System.out.println("Total:16.50$");
                    }else{

                        System.out.println("Total:14.00$");
                    }
                    break;
                }
                break;
                
            case 2:
            System.out.println("¿Quieres nata? ");
            System.out.println("1.Si  2.No ");
            int nata2=sc.nextInt();
            System.out.println("¿Quieres poner nombre? ");
            System.out.println("1.Si  2.No ");
            int respuesta_nombre2=sc.nextInt();
            switch(respuesta_nombre2){
                case 1:
                    
                        System.out.println("Tarta de manzana:18.00$");
                        if(nata2==1){
                            System.out.println("Con nata: 2.50$");
                            System.out.println("Con nombre: 2.75$");
                            System.out.println("Total:23.25$");
                        }else{
                            System.out.println("Con nombre: 2.75$");
                            System.out.println("Total:20.75$");
                        }
                        break;

                case 2:
                        System.out.println("Tarta de manzana:18.00$");
                        if(nata2==1){
                            System.out.println("Con nata: 2.50$");
                            System.out.println("Total:20.50$");
                        }else{
    
                            System.out.println("Total:18.00$");
                        }

                    }
            break;
            

            case 3:

            System.out.println("¿Quieres nata? ");
            System.out.println("1.Si  2.No ");
            int nata3=sc.nextInt();
            System.out.println("¿Quieres poner nombre? ");
            System.out.println("1.Si  2.No ");
            int respuesta_nombre3=sc.nextInt();
            switch(respuesta_nombre3){
                case 1:
                    
                        System.out.println("Tarta de fresa:16.00$");
                        if(nata3==1){
                            System.out.println("Con nata: 2.50$");
                            System.out.println("Con nombre: 2.75$");
                            System.out.println("Total:21.25$");
                        }else{
                            System.out.println("Con nombre: 2.75$");
                            System.out.println("Total:18.75$");
                        }
                        break;

                case 2:
                        System.out.println("Tarta de fresa:16.00$");
                        if(nata3==1){
                            System.out.println("Con nata: 2.50$");
                            System.out.println("Total:18.50$");
                        }else{
    
                            System.out.println("Total:16.00$");
                        }
                        break;

                        }
                 break;
        

                    }
        sc.close();
    }
    }