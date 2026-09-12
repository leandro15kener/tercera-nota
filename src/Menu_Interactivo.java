//Escribe un programa que presente un menú al usuario, y dependiendo de la opción seleccionada,
//realice una operación simple (como sumar dos números, restar, multiplicar o dividir)
//utilizando una estructura switch.

import java.util.Scanner;
public class Menu_Interactivo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("BIENVENIDO AL MENU INTERACTIVO");
        System.out.println("  ");
        System.out.println("Seleccione una opcion: ");
        System.out.println("1. Sumar dos numeros");
        System.out.println("2. Restar dos numeros");
        System.out.println("3. Multiplicar dos numeros");
        System.out.println("4. Dividir dos numeros");
        int opcion = lector.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el primer numero: ");
                double numero1 = lector.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                double numero2 = lector.nextDouble();
                double suma = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + suma);
                break;
            case 2:
                System.out.println("Ingrese el primer numero: ");
                double numero3 = lector.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                double numero4 = lector.nextDouble();
                double resta = numero3 - numero4;
                System.out.println("El resultado de la resta es: " + resta);
                break;
            case 3:
                System.out.println("Ingrese el primer numero: ");
                double numero5 = lector.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                double numero6 = lector.nextDouble();
                double multiplicacion = numero5 * numero6;
                System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
                break;
            case 4:
                System.out.println("Ingrese el primer numero: ");
                double numero7 = lector.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                double numero8 = lector.nextDouble();
                if (numero8 != 0) {
                    double division = numero7 / numero8;
                    System.out.println("El resultado de la division es: " + division);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opcion invalida.");
        }

        lector.close();
    }
}