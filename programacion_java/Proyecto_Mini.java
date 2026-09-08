//Desarrollar un programa en Java que calcule la media de tres números introducidos por el usuario
//y muestre el resultado.

import java.util.Scanner;
public class Proyecto_Mini {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("BIENVENIDO AL PROGRAMA PARA HALLAR LA MEDIA DE TRES NUMEROS");
        System.out.println("  ");
        System.out.println("Ingrese su primer numero: ");
        double numeroUno = lector.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double numeroDos = lector.nextDouble();
        System.out.println("Ingrese su tercer numero: ");
        double numeroTres = lector.nextDouble();

        double Media = ((numeroUno + numeroDos + numeroTres)/3);
        System.out.println("La media hallada es de: " + Media);

        lector.close();
    }

}
