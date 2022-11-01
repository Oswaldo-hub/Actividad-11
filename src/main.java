import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu ( ) {
        double v1;
        Scanner entrada = new Scanner(System.in);
       try{ System.out.println("Hola presiona uno de los siguientes numeros para conocer el area y perimetro de una de las siguientes figuras."+"\n "
        + "Presiona 1 para conocer el area y perimetro del circulo"+"\n "
        +"Presiona 2 para conocer el area y perimetro del cuadrado"+"\n "
        +"Presiona 3 para conocer el area y perimetro del cuadrado"+"\n "
        +"presiona 0 para salir"+"\n ");
        int  r1 = entrada.nextInt();
        if(r1==1){ System.out.println("Dime el radio del circulo");
          v1 = entrada.nextDouble();
            Circle circle = new Circle(v1);
            System.out.println("area circulo " + circle.getarea());
            System.out.println("perimetro circulo " + circle.getperimeter());

             System.out.println("Presiona 1 para regresar al menu"+"\n " +
                                "Presiona cualquier otro numero para salir");

               int  r2 = entrada.nextInt();
              if(r2==1) {menu();}}
        else if(r1==2) {System.out.println("Dime el lado del cuadrado");
            v1 = entrada.nextDouble();
            Square square = new Square(v1);
            System.out.println("Area del cuadrado " + square.getarea());
            System.out.println("perimetro cuadrado " +square.getperimeter());
            System.out.println("Presiona 1 para regresar al menu"+"\n " +
                    "Presiona cualquier otro numero para salir");

            int  r2 = entrada.nextInt();
            if(r2==1) {menu();}
        }
        else if(r1==3) {System.out.println("Dime el ladoo  del triangulo");
            v1 = entrada.nextDouble();
            Triangle triangle = new Triangle(v1);
            System.out.println("area triangulo " + triangle.getarea());
            System.out.println("perimetro triangulo " + triangle.getperimeter());
            System.out.println("Presiona 1 para regresar al menu"+"\n " +
                    "Presiona cualquier otro numero para salir");

            int  r2 = entrada.nextInt();
            if(r2==1) {menu();}
        }
        else if((r1 < 0) || (r1> 3)) {
            throw new IllegalArgumentException("Esta opcion no existe.");
        }
        } catch (InputMismatchException e)  {
           System.out.println("Escribiste una letra,  debes escribir un numero" );
 menu();}
       catch (IllegalArgumentException e) {
           System.out.println("Esta opcion no existe");
           menu();
       }
    }}
