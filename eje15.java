import java.util.Scanner;

public class eje15{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Para que direccion quieres que apunte la piramide?");
        System.out.println("a)arriba. b)abajo. c)izquierda. d)derecha.");
        String direccion = sc.next();
        if(direccion.equals("a")){
            System.out.println("    *");
            System.out.println("   ***");
            System.out.println("  *****");
            System.out.println(" *******");
            System.out.println("*********");
        }
        if(direccion.equals("b")){
            System.out.println("*********");
            System.out.println(" *******");
            System.out.println("  *****");
            System.out.println("   ***");
            System.out.println("    *");
        }
        if(direccion.equals("d")){
            System.out.println("*");
            System.out.println("**");
            System.out.println("***");
            System.out.println("****");
            System.out.println("*****");
            System.out.println("****");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");
        }
        if(direccion.equals("c")){
            System.out.println("      *");
            System.out.println("     **");
            System.out.println("    ***");
            System.out.println("   ****");
            System.out.println("  *****");
            System.out.println("   ****");
            System.out.println("    ***");
            System.out.println("     **");
            System.out.println("      *");
        }



	sc.close();
    
    }
}