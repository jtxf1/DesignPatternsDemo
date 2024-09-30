package design.patterns.creational.builder.interfaces.imp;

public class Pepsi extends ColdDrinkImpl {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}