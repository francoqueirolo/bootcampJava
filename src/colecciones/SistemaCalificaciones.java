package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        List<Double> calificaciones = new ArrayList<>();
        calificaciones.add(11.4);
        calificaciones.add(18.0);
        calificaciones.add(13.4);
        calificaciones.add(14.5);
        calificaciones.add(16.4);

        double suma = 0;

        for(Double calificacion: calificaciones) {
            suma += calificacion;
        }

        double promedio = suma / calificaciones.size();
        System.out.println("El promedio es: "+promedio);

        double min = Collections.min(calificaciones);
        double max = Collections.max(calificaciones);

        System.out.println("El minimo es: "+min);
        System.out.println("El maximo es: "+max);

        System.out.println("Contiene la nota 18: " + calificaciones.contains(18.00));
    }
}
