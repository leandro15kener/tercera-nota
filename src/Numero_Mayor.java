//Escribe un programa que lea tres números del usuario y determine cuál es el mayor de los tres
//utilizando una estructura if-else.

import java.util.Scanner;
public class Numero_Mayor {
    public static void main(String[] args){
        Scanner Lector = new Scanner(System.in);
        System.out.println("ingrese el primer número: ");
        double Numero1 = Lector.nextDouble();
        System.out.println("ingrese el segundo número: ");
        double Numero2 = Lector.nextDouble();
        System.out.println("ingrese el tercer número: ");
        double Numero3 = Lector.nextDouble();

        if (Numero1 > Numero2 && Numero1 > Numero3){
            System.out.println("El numero mayor es: "+ Numero1);
        } else if (Numero2 > Numero1 && Numero2 > Numero3){
            System.out.println("El numero mayor es: "+ Numero2);
        } else {
            System.out.println("El numero mayor es: "+ Numero3);
        }

        Lector.close();

    }
}