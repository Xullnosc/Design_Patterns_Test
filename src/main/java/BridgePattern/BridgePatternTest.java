package BridgePattern;

public class BridgePatternTest {
    public static void main(String[] args) {

    }
}

abstract class Pizza {
    protected String toppings;
    protected String crust;
    protected String size;
    protected String sauce;

    public abstract void assemble();

    public abstract void qualityCheck();

    public void setToppings(String toppings) {

        this.toppings = toppings;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getToppings() {
        return toppings;
    }

    public String getCrust() {
        return crust;
    }

    public String getSize() {
        return size;
    }

    public String getSauce() {
        return sauce;
    }
}

class PeperoniPizza extends Pizza {


    @Override
    public void assemble() {
        System.out.println("Peperoni");
        System.out.println("Sauce: " + sauce);
        System.out.println("Toppings: " + toppings);
        System.out.println("Size: " + size);
    }

    @Override
    public void qualityCheck() {
        System.out.println("Crust: " + crust);
    }
}

class Veggie extends Pizza {


    @Override
    public void assemble() {
        System.out.println("Peperoni");
        System.out.println("Sauce: " + sauce);
        System.out.println("Toppings: " + toppings);
        System.out.println("Size: " + size);
    }

    @Override
    public void qualityCheck() {
        System.out.println("Crust: " + crust);
    }
}

abstract class Restaurant {
    protected Pizza pizza;

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract void addTopping();

    public abstract void addCrust();

    public abstract void addSize();

    public abstract void addSauce();


    public void deliver() {
        addTopping();
        addCrust();
        addSize();
        addSauce();
        pizza.assemble();
        pizza.qualityCheck();
    }
}


class AmericanRestaurant extends Restaurant {
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addTopping() {
        pizza.setToppings(null);
    }

    @Override
    public void addCrust() {
        pizza.setCrust("thick");
    }

    @Override
    public void addSize() {
        pizza.setSize("huge");
    }

    @Override
    public void addSauce() {
        pizza.setSauce("MORE");
    }
}