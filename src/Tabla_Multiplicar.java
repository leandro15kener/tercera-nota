//Escribe un programa que genere la tabla de multiplicar de un número ingresado por el usuario
//utilizando un ciclo for.
import java.util.Scanner;
public class Tabla_Multiplicar {    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero para generar su tabla de multiplicar: ");
        int numero = lector.nextInt();
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        lector.close();
    }
}