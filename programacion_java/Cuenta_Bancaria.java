public class Cuenta_Bancaria {
    public static void main(String[] args) {
       double saldo = 1000;
       double retiroSemanal = 200;
       int cantidadSemanas = 4;
    
       double dineroRestante  = saldo - (retiroSemanal * cantidadSemanas);

       System.out.println("La cantidad de dinero restante en la cuenta después de los retiros semanales es de: "  +  dineroRestante);

    }


}
