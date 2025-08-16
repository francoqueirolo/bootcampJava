package colecciones;

import java.util.HashMap;
import java.util.Map;

public class MapasGuide {
    public static void main(String[] args) {
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Pepito", 28);
        edades.put("Uriel", 23);
        edades.put("Paula", 21);

        for(var e: edades.entrySet()) {
            String nombre = e.getKey();
            Integer edad = e.getValue();
            System.out.println(nombre + " tiene " + edad);
        }

        //streams nueva forma de iterar
        edades.forEach((clave, valor) -> System.out.println(clave + " tiene " + valor));

    }
}
