import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //1- identificar variables
        int a, b, total;
        Scanner s = new Scanner(System.in);

       //2- Imprimir el mensaje "Ingrese a"
        System.out.println("Ingrese a");

       //3- Leer y almacenar valor en variable a
        a = s.nextInt();

       //4- Imprimir el mensaje "Ingrese b"
        System.out.println("Ingrese b");

       //5- Leer y almacenar en variable b
        b = s.nextInt();

       //6- total = a * b
        total = a * b ;

       //7- Imprimir el mensaje "el resultado es " al valor total
        System.out.println("el resultado es:" + total);

    }
}