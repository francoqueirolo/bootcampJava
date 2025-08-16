import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // Calculadora de descuento con evaluacion de cliente
        // Calcula el precio final con descuento.
        // - Determina si el cliente es VIP o Normal usando ternario.
        // - Muestra mensajes diferentes según el precio final usando if-else.
        // Si es Vip el descuento debe ser del 20% si es descuento normal debe ser 5%
        // Mostrar el precio final con el descuento aplicado

        System.out.println("Calculadora de Descuento!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa precio del producto: ");
        double precio = sc.nextDouble();

        System.out.println("Ingresa el tipo de cliente: VIP=1, NORMAL=2");
        int tipo = sc.nextInt();
        sc.close();

        double descuento = precio - precio * 0.05;
        String usuario = "Regular";

        if(tipo == 1) {
            usuario = "VIP";
            descuento = precio - precio * 0.2;
        }
        System.out.println("Tipo de usuario: "+ usuario);
        System.out.println("Precio Total        : "+ precio);
        System.out.println("Descuento           : "+ (precio-descuento));
        System.out.println("Precio con descuento: "+ descuento);
    }
}