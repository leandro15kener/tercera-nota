//Crea un programa en Java que solicite al usuario tres números 
//y determine si el primero es mayor que el segundo y menor que el tercero. 
//El programa debe utilizar tanto operadores de comparación como operadores lógicos.

import java.util.Scanner;

public class ComparacionLogico {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numeroUno = lector.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numeroDos = lector.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numeroTres = lector.nextInt();

        boolean resultado = (numeroUno > numeroDos) && (numeroUno < numeroTres);

        System.out.println("El primer número es mayor que el segundo y menor que el tercero: " + resultado);

        lector.close();
        
    }
}
