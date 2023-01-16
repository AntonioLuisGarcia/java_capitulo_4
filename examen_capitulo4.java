//@author: Antonio Luis Garcia Guerrero

import java.util.Scanner;
public class examen_capitulo4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Con este programa haremos un ticket");
    System.out.println("Primero, diga que tipo de producto ha comprado:");

    //primero daremos un listado de las opciones

    System.out.println("1. Alimentación");
    System.out.println("2. Electrónica");
    System.out.println("3. Farmacia");
    System.out.println("4. Moda");
    System.out.print("Opcion:");

    //leeremos la opcion y segun el caso mostraremos una serie de descuentos o iva distinto

    int opcion_tipo_producto=sc.nextInt();
    int opcion_tipo_alimento;
    String nombre_producto;
    float precio_producto;
    int cantidad_producto;
    int cantidad_oferta=0;
    float precio_sin_iva;
    float precio_con_iva;
    float iva_producto;
    float iva;



    switch(opcion_tipo_producto){
        case 1:

            //si escoge la opcion 1 tambien tendra que escoger que tipo de alimento es

            System.out.println("Introduzca el tipo de alimento");
            System.out.println("1. Huevos");
            System.out.println("2. Leche");

            //en el ejemplo se salta el tres,dare por hecho de que es una errata

            System.out.println("3. Pan");
            System.out.println("4. Fruta");
            System.out.println("5. Verdura");
            System.out.println("6. Otros");

            opcion_tipo_alimento=sc.nextInt();

                switch(opcion_tipo_alimento){

                    //para las 5 primeras opciones hay el mismo IVA, que es 4%

                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:

                        iva=(float)4/100;
                            
                        System.out.print("Introduzca el nombre del producto(sin espacios): ");
                        nombre_producto=sc.next();
                        
                        System.out.print("Introduzca la cantidad de productos: ");
                        cantidad_producto=sc.nextInt();

                        System.out.print("Introduzca el precio por unidad del producto: ");
                        precio_producto=sc.nextFloat();
                        System.out.println();
                        System.out.println();

                        //creo estas variables para facilitar y no equivocarme a la hora de imprimirlas
                        
                        precio_sin_iva=(float)(cantidad_producto*precio_producto);
                        iva_producto=iva*precio_sin_iva;
                        precio_con_iva=iva_producto+precio_sin_iva;

                            System.out.println("Factura");
                            System.out.println("________________________________________");
                            System.out.printf("%-19s","Articulo");
                            System.out.printf("%21s",nombre_producto);
                            System.out.println();
                            
                            System.out.printf("%-19s","Precio");
                            System.out.printf("%21s",precio_producto+"$"+"/unidad");
                            System.out.println();

                            System.out.printf("%-19s","Cantidad");
                            System.out.printf("%21s",cantidad_producto);
                            System.out.println();

                            System.out.printf("%-19s","Total");
                            System.out.printf("%21s",(float)((int)(precio_sin_iva*10))/10+"$");
                            System.out.println();
                            
                            System.out.printf("%-19s","IVA del producto");
                            System.out.printf("%21s",(float)((int)(iva_producto*10))/10+"$");
                            System.out.println();

                            System.out.println("________________________________________");
                            System.out.printf("%-19s","Total con IVA");
                            System.out.printf("%21s", (float)((int)(precio_con_iva*10))/10+"$");

                    break;

                    //para la opcion 6 el IVA cambia y es 10%

                    case 6:

                        iva=(float)1/10;
                        
                        System.out.print("Introduzca el nombre del producto(sin espacios): ");
                        nombre_producto=sc.next();
                        
                        
                        System.out.print("Introduzca la cantidad de productos: ");
                        cantidad_producto=sc.nextInt();
                        
                        
                        System.out.print("Introduzca el precio por unidad del producto: ");
                        precio_producto=sc.nextFloat();
                        System.out.println();
                        System.out.println();
                        
                        precio_sin_iva=(float)(cantidad_producto*precio_producto);
                        iva_producto=iva*precio_sin_iva;
                        precio_con_iva=iva_producto+precio_sin_iva;

                            System.out.println("Factura");
                            System.out.println("________________________________________");
                            System.out.printf("%-19s","Articulo");
                            System.out.printf("%21s",nombre_producto);
                            System.out.println();
                            
                            System.out.printf("%-19s","Precio");
                            System.out.printf("%21s",precio_producto+"/unidad");
                            System.out.println();

                            System.out.printf("%-19s","Cantidad");
                            System.out.printf("%21s",cantidad_producto);
                            System.out.println();

                            System.out.printf("%-19s","Total");
                            System.out.printf("%21s",(float)((int)(precio_sin_iva*10))/10+"$");
                            System.out.println();
                            
                            System.out.printf("%-19s","IVA del producto");
                            System.out.printf("%21s",(float)((int)(iva_producto*10))/10+"$");
                            System.out.println();

                            System.out.println("________________________________________");
                            System.out.printf("%-19s","Total con IVA");
                            System.out.printf("%21s",(float)((int)(precio_con_iva*10))/10+"$");

                        break;
                }


        break;

        case 2:
                iva=(float)21/100;
                                    
                System.out.print("Introduzca el nombre del producto(sin espacios): ");
                nombre_producto=sc.next();
            
                
                System.out.print("Introduzca la cantidad de productos: ");
                cantidad_producto=sc.nextInt();
                
                
                System.out.print("Introduzca el precio por unidad del producto: ");
                precio_producto=sc.nextFloat();
                System.out.println();
                System.out.println();
                
                //en esta opcion tenemos ademas del IVA un descuento

                precio_sin_iva=(float)(cantidad_producto*precio_producto);
                iva_producto=(float)(iva*(precio_sin_iva*2/10));
                precio_con_iva=(float)(precio_sin_iva-(precio_sin_iva*0.2+iva_producto));

                    System.out.println("Factura");
                    System.out.println("________________________________________");
                    System.out.printf("%-19s","Articulo");
                    System.out.printf("%21s",nombre_producto);
                    System.out.println();
                    
                    System.out.printf("%-19s","Precio");
                    System.out.printf("%21s",precio_producto+"/unidad");
                    System.out.println();

                    System.out.printf("%-19s","Cantidad");
                    System.out.printf("%21s",cantidad_producto);
                    System.out.println();

                    System.out.printf("%-19s","Total");
                    System.out.printf("%21s",(float)((int)(precio_sin_iva*10))/10+"$");
                    System.out.println();

                    System.out.printf("%-19s","Descuento (20%)");
                    System.out.printf("%21s",(float)((int)((precio_sin_iva*-0.2)*10))/10+"$");
                    System.out.println();

                    System.out.printf("%-19s","Total con descuento");
                    System.out.printf("%21s",(float)((int)((precio_sin_iva-precio_sin_iva*-0.2)*10))/10+"$");
                    System.out.println();
                    
                    System.out.printf("%-19s","IVA del producto");
                    System.out.printf("%21s",(float)((int)(iva_producto*10))/10+"$");
                    System.out.println();

                    System.out.println("________________________________________");
                    System.out.printf("%-19s","Total con IVA");
                    System.out.printf("%21s",(float)((int)(precio_con_iva*10))/10+"$");
                
        break;

        case 3:

                iva=(float)4/100;

                    System.out.print("Introduzca el nombre del producto(sin espacios): ");
                    nombre_producto=sc.next();
                    
                    System.out.print("Introduzca la cantidad de productos: ");
                    cantidad_producto=sc.nextInt();
                    
                    System.out.print("Introduzca el precio por unidad del producto: ");
                    precio_producto=sc.nextFloat();
                    System.out.println();
                    System.out.println();

                    precio_sin_iva=(float)(cantidad_producto*precio_producto);
                    iva_producto=iva*precio_sin_iva;
                    precio_con_iva=iva_producto+precio_sin_iva;

                    System.out.println("Factura");
                    System.out.println("________________________________________");
                    System.out.printf("%-19s","Articulo");
                    System.out.printf("%21s",nombre_producto);
                    System.out.println();
                    
                    System.out.printf("%-19s","Precio");
                    System.out.printf("%21s",precio_producto+"/unidad");
                    System.out.println();

                    System.out.printf("%-19s","Cantidad");
                    System.out.printf("%21s",cantidad_producto);
                    System.out.println();

                    System.out.printf("%-19s","Total");
                    System.out.printf("%21s",(float)((int)(precio_sin_iva*10))/10+"$");
                    System.out.println();
                    
                    System.out.printf("%-19s","IVA al 4%");
                    System.out.printf("%21s",(float)((int)(iva_producto*10))/10+"$");
                    System.out.println();

                    System.out.println("________________________________________");
                    System.out.printf("%-19s","Total con IVA");
                    System.out.printf("%21s",(float)((int)(precio_con_iva*10))/10+"$");        

        break;

        case 4:

                iva=(float)21/100;

                System.out.print("Introduzca el nombre del producto(sin espacios): ");
                nombre_producto=sc.next();
                
                System.out.print("Introduzca la cantidad de productos: ");
                cantidad_producto=sc.nextInt();

                //dividimos la cantidad para saber cuantas veces llega a ser multiplo y por cada vez se le resta uno a la cantidad

                if(cantidad_producto/3>=1){
                    cantidad_oferta=(int)(cantidad_producto/3);
                }
                
                System.out.print("Introduzca el precio por unidad del producto: ");
                precio_producto=sc.nextFloat();
                System.out.println();
                System.out.println();

                precio_sin_iva=(float)(cantidad_producto*precio_producto);
                iva_producto=iva*(precio_sin_iva+cantidad_oferta*-precio_producto);
                precio_con_iva=iva_producto+(precio_sin_iva+cantidad_oferta*-precio_producto);

                System.out.println("Factura");
                System.out.println("________________________________________");
                System.out.printf("%-19s","Articulo");
                System.out.printf("%21s",nombre_producto);
                System.out.println();
                
                System.out.printf("%-19s","Precio");
                System.out.printf("%21s",precio_producto+"/unidad");
                System.out.println();

                System.out.printf("%-19s","Cantidad");
                System.out.printf("%21s",cantidad_producto);
                System.out.println();

                System.out.printf("%-19s","Total");
                System.out.printf("%21s",(float)((int)(precio_sin_iva*10))/10+"$");
                System.out.println();

                System.out.printf("%-19s","Descuento (3X2)");
                System.out.printf("%21s",(float)((int)((cantidad_oferta*-precio_producto)*10))/10+"$");
                System.out.println();

                System.out.printf("%-19s","Total con descuento");
                System.out.printf("%21s",(float)((int)((precio_sin_iva+cantidad_oferta*-precio_producto)*10))/10+"$");
                System.out.println();
                
                System.out.printf("%-19s","IVA al 21%");
                System.out.printf("%21s",(float)((int)(iva_producto*10))/10+"$");
                System.out.println();

                System.out.println("________________________________________");
                System.out.printf("%-19s","Total con IVA");
                System.out.printf("%21s",(float)((int)(precio_con_iva*10))/10+"$"); 

        break;
    }



   
    sc.close();
    }
}