package colecciones;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ColeccionGuide {
    public static void main(String[] args) {
        List<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Javascript");
        lenguajes.add("Typescript");

        for (String lenguaje : lenguajes) {
            System.out.println(lenguaje);
        }
        lenguajes.sort(Comparator.comparing(String::length));

        System.out.println("El elemento Java existe? " + lenguajes.contains("Java"));
        System.out.println(lenguajes.get(1));

       lenguajes.remove(2);

       lenguajes.set(1, "C#");

        for (String lenguaje : lenguajes) {
            System.out.println(lenguaje);
        }
    }
}
