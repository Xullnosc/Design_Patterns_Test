package PrototypePattern;
// Shallow cloning
// Avoid tight coupling when cloning
/*  Deep cloning can be implemented by moving the clone method
    from interface to an abstract class such as Vehicle if you are working with many types of vehicle*/
public interface Prototype {
    public Car clone();
}

class Car implements Prototype {
    private String color;
    private int price;
    private String model;
    private int year;
    private String engine;
    public Car(String color, int price, String model, int year, String engine) {
        this.color = color;
        this.price = price;
        this.model = model;
        this.year = year;
        this.engine = engine;
    }
    public Car ( Car car) {
        this.color = car.color;
        this.price = car.price;
        this.model = car.model;
        this.year = car.year;
        this.engine = car.engine;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }


}
