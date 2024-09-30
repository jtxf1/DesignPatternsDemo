package design.patterns.creational.builder.interfaces.imp;

public class Coke extends ColdDrinkImpl {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}