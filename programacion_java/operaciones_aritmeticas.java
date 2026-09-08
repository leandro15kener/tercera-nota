import java.util.Scanner;
public class operaciones_aritmeticas {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        System.out.print("Ingrese el primer numero de la operacion: ");
        int primer_numero = lector .nextInt();
        System.out.print("ingrese el segundo numero de la operacion: ");
        int segundo_numero = lector .nextInt();

        int suma = primer_numero + segundo_numero;
        int resta = primer_numero - segundo_numero;
        int multiplicacion = primer_numero * segundo_numero;        
        int division = primer_numero / segundo_numero;
        int modulo = primer_numero % segundo_numero;

        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("El resultado de la resta es: " + resta);
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        System.out.println("El resultado de la division es: " + division);
        System.out.println("El resultado del modulo es: " + modulo);

        System.out.println("FIN DE LAS OPERACIONES ARITMETICAS");
        lector.close();


    }

}
