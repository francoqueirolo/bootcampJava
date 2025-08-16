public class TablaColumna {
    public static void main(String[] args) {

        System.out.println("");

        for (int i = 1; i <= 5; i++) {
            if(i==1) {
                for (int k = 1; k <= 5; k++) {
                    System.out.print("Tabla " + k + "\t\t");
                }
                System.out.println("");
            }

            for (int j = 1; j <= 5; j++) {
                System.out.print(j+" x "+ i +" = " + j*i + "\t");
            }

            System.out.println("");
        }
    }
}