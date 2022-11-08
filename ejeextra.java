/* Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y la zona a la que va dirigida
Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por cuestiones de logística y seguridad.
Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.*/

import java.util.Scanner;
public class ejeextra{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa sabras cuanto te cueta el envio del pedido");
        System.out.println("¿A donde quieres que lo enviemos? ");
        
        String lugar= sc.next();
        float peso;

        switch(lugar){
            case "America":
                    System.out.println("En que parte de america");
                    String parte_america=sc.next();
                switch(parte_america){

                        case "norte":

                            System.out.println("¿Cuanto pesa tu pedido?");
                            peso=sc.nextFloat();
                            if(peso>5){
                                System.out.println("Lo sentimos no podemos soportar pedidos tan pesados");
                            }else{
                                System.out.printf("Su pedido cuesta %.2f euros",peso*24);
                            }
                            break;

                        case "central":

                            System.out.println("¿Cuanto pesa tu pedido?");
                            peso=sc.nextFloat();
                            if(peso>5){
                                System.out.println("Lo sentimos no podemos soportar pedidos tan pesados");
                            }else{
                                System.out.printf("Su pedido cuesta %.2f euros",peso*20);
                            }
                            break;

                        case "sur":

                            System.out.println("¿Cuanto pesa tu pedido?");
                            peso=sc.nextFloat();
                            if(peso>5){
                                System.out.println("Lo sentimos no podemos soportar pedidos tan pesados");
                            }else{
                                System.out.printf("Su pedido cuesta %.2f euros",peso*21);
                            }
                            break;

                    }
                    break;

            case "Europa":
                System.out.println("¿Cuanto pesa tu pedido?");
                peso=sc.nextFloat();
                if(peso>5){
                    System.out.println("Lo sentimos no podemos soportar pedidos tan pesados");
                }else{
                    System.out.printf("Su pedido cuesta %.2f euros",peso*10);
                }
                break;

            case "Asia":
                System.out.println("¿Cuanto pesa tu pedido?");
                peso=sc.nextFloat();
                if(peso>5){
                    System.out.println("Lo sentimos no podemos soportar pedidos tan pesados");
                }else{
                    System.out.printf("Su pedido cuesta %.2f euros",peso*18);
                }
                break;
        }

        sc.close();
    }
    }