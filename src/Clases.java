import feature.Car;
import feature.Persona;

import java.util.Scanner;

public class Clases {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        Car toyota = new Car();
        toyota.acelerate();
        toyota.stop();

        Persona franco = new Persona(0, 1.72, "Franco", "Queirolo", "Divorciado");
        franco.getAge();
        franco.geFullName();

        //calculadora
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int division = num1 / num2;
        int multiplicacion = num1 * num2;

        System.out.println("La suma es de: "+suma);
        System.out.println("La resta es de: "+resta);
        System.out.println("La division es de: "+division);
        System.out.println("La multiplicacion es de: "+multiplicacion);
    }

}