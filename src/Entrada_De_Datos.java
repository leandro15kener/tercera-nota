//Crea un programa que solicite al usuario su nombre, edad, y altura,
//y luego muestre un mensaje personalizado que incluya todos esos datos.

import java.util.Scanner;
public class Entrada_De_Datos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo: ");
        String Nombre = lector.nextLine();
        System.out.println("Ingrese su edad: ");
        int Edad = lector.nextInt();
        System.out.println("ingrese su altura en metros: ");
        double Altura = lector.nextDouble();

        System.out.println("Hola "+ Nombre + " tu edad es de " + Edad + " y mides " + Altura + " m. " );

        lector.close();
    }
}
