package feature;

public class Persona {
    int edad;
    double altura;
    String nombre;
    String apellido;
    String estadoCivil;

    public Persona(int edad, double altura, String nombre, String apellido, String estadoCivil) {
        this.edad = edad;
        this.altura = altura;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
    }

    public void geFullName(){
        System.out.println(nombre+" "+apellido);
    }
    public void getAge(){
        System.out.println("Edad: "+edad);
    }
    public void getState(){
        System.out.println("Estado civil: "+estadoCivil);
    }
}