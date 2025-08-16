import java.util.Scanner;

public class TablaBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero de tabla");
        int num = sc.nextInt();
        System.out.println("Tabla del "+num);


        for (int i = 1; i < 13; i++) {
            System.out.println(num+"*"+i +" = "+ i*num);
        }


    }
}