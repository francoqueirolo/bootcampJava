import java.util.Scanner;

public class ConversorBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar monto en dolares: ");
        double monto = sc.nextInt();

        if(monto <= 0) {
            System.out.println("Monto debe ser mayor que 0");
            return;
        }

        System.out.println("Seleccione moneda: ");
        System.out.println("1 -> Euro");
        System.out.println("2 -> Pesos");
        System.out.println("3 -> Soles");
        int moneda = sc.nextInt();
        double coversion = 0;
        boolean operacionValida = true;

        switch (moneda) {
            case 1:
                coversion = monto * 0.92;
                break;
            case 2:
                coversion = monto * 17;
                break;
            case 3:
                coversion = monto * 3.55;
                break;

            default:
                System.out.println("Operacion no valida");
                operacionValida = false;
        }

        System.out.println("El resultado es " + coversion);

        if(operacionValida) {
            String calificacion = monto > 1000 ? "alta" : "baja";
            System.out.println("Es un monto: "+calificacion);
        }
    }
}