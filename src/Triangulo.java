public class Triangulo {
    public static void main(String[] args) {
        int filas = 5;

        for (int i = 1; i <= filas; i++) {

            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}