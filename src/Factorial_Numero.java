//Desarrolla un programa que calcule el factorial de un número dado por el usuario utilizando
//un ciclo

import java.util.Scanner;
public class Factorial_Numero {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular su factorial: ");
        int numero = lector.nextInt();
        int factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
        lector.close();
    }
}