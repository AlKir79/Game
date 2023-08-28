public class Car {
    private String name;
    private int year;
    private Engine engine;
    private Transmission transmission;
    private Wheels wheels;
    private Body body;

    public Car(String name, int year, Engine engine, Transmission transmission, Wheels wheels, Body body) {
        this.name = name;
        this.year = year;
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.body = body;
    }


    public Car() {
        this.name = "Siber";
        this.year = 2010;
        this.engine = new Engine();
        this.transmission = new Transmission();
        this.wheels = new Wheels();
        this.body = new Body();

    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", wheels=" + wheels +
                ", body=" + body +
                '}';
    }
}
