import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingresar primer numero: ");
        int num2 = sc.nextInt();
        System.out.println("Elige una opracion: ");
        char operacion = sc.next().charAt(0);
        boolean valida = true;

        double resultado = 0;
        String label = "Suma";

        switch (operacion) {
            case '+':
                label = "Suma";
                resultado = num1 + num2;
                break;
            case '-':
                label = "Resta";
                resultado = num1 - num2;
                break;
            case '*':
                label = "Multiplicacion";
                resultado = num1 * num2;
                break;
            case '/':
                if(num1 == 0) {
                    System.out.println("Error division por cero");
                    valida = false;
                    break;
                }

                label = "Division";
                resultado = num1 / num2;
                break;

            default:
                System.out.println("Operacion no valida");
                valida = false;
        }

        if(valida) {
           String tipoResultado = resultado >= 0 ? "Positivo" : "Negativo";
           System.out.println("Resultado: "+resultado+" "+tipoResultado);
        }

        System.out.println("El resultado de la" +label+ " es" + resultado);
    }
}