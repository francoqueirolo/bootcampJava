package feature;

public class Car {
    String color;
    String marca;
    String modelo;

    public Car() {
    }

    public Car(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int acelerate() {
        return 2*3;
    }

    public void stop() {
        System.out.println("stop");
    }
}
