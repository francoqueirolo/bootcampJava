import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorDeMonedas {

    public static void main(String[] args) {
         double TASA_DOLAR = 0.27;
         double TASA_EURO = 0.25;
         double TASA_YEN = 41.99;
         double TASA_RUBLO = 22.63;

        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("--- Conversor de Monedas y Calculadora ---");
            System.out.println("1. Convertir Soles a Dólares");
            System.out.println("2. Convertir Soles a Euros");
            System.out.println("3. Convertir Soles a Yenes");
            System.out.println("4. Convertir Soles a Rublos");
            System.out.println("5. Usar la Calculadora");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        convertirMoneda(scanner, "Dólares", TASA_DOLAR);
                        break;
                    case 2:
                        convertirMoneda(scanner, "Euros", TASA_EURO);
                        break;
                    case 3:
                        convertirMoneda(scanner, "Yenes", TASA_YEN);
                        break;
                    case 4:
                        convertirMoneda(scanner, "Rublos", TASA_RUBLO);
                        break;
                    case 5:
                        calculadora(scanner);
                        break;
                    case 6:
                        System.out.println("¡Gracias por usar el programa! Hasta pronto.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 6.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número válido para la opción.");
                scanner.nextLine();
            }

            System.out.println();
        }
    }

    public static void convertirMoneda(Scanner scanner, String moneda, double tasa) {
        System.out.print("Ingrese la cantidad de Soles a convertir: ");
        try {
            double soles = scanner.nextDouble();
            double resultado = soles * tasa;

            double solesTruncados = (int)(soles * 100) / 100.0;
            double resultadoTruncado = (int)(resultado * 100) / 100.0;

            System.out.println(solesTruncados + " Soles equivalen a " + resultadoTruncado + " " + moneda + ".");

        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor, ingrese una cantidad numérica válida.");
        }
        scanner.nextLine();
    }

    public static void calculadora(Scanner scanner) {
        System.out.println("--- Calculadora Básica ---");
        try {
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el operador (+, -, *, /): ");
            String operador = scanner.next();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;
            boolean operacionValida = true;

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Error: Operador no válido.");
                    operacionValida = false;
                    break;
            }

            if (operacionValida) {
                double resultadoTruncado = (int)(resultado * 100) / 100.0;
                System.out.println("El resultado es: " + resultadoTruncado);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor, ingrese valores numéricos válidos.");
        }
        scanner.nextLine();
    }
}