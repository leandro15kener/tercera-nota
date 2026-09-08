//Una tienda de ropa está ofreciendo una promoción en la que se aplica un descuento del 15% sobre 
// el precio original de cada prenda. Si una camiseta cuesta $25 y un pantalón cuesta $30, 
// ¿Cuál será el precio total de ambas prendas después de aplicar el descuento? Además,
// si se compra una segunda camiseta, se aplica un descuento adicional del 5% 
// sobre el precio ya descuento de la primera camiseta.
public class Tienda_Promocion {
    public static void main(String[] args) {
        final double PRECIO_CAMISETA = 25;
        final double PRECIO_PANTALON = 30;
        final double DESCUENTO = 0.15;
        final double DESCUENTO_ADICIONAL = 0.05;

        double descuentoCamiseta = PRECIO_CAMISETA * (1 - DESCUENTO);
        double descuentoPantalon = PRECIO_PANTALON * (1 - DESCUENTO);
        double descuentoCamiseta2 = descuentoCamiseta * (1 - DESCUENTO_ADICIONAL);
        double total = descuentoCamiseta + descuentoPantalon + descuentoCamiseta2;

        System.out.println("PRECIO DE LA PRIMERA CAMISETA: " + descuentoCamiseta);
        System.out.println("PRECIO DEL PANTALON: " + descuentoPantalon);
        System.out.println("PRECIO DE LA SEGUNDA CAMISETA: " + descuentoCamiseta2);
        System.out.println("PRECIO TOTAL DE AMBAS PRENDAS: " + total);

    }
}
