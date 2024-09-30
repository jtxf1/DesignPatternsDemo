package design.patterns.creational.builder.interfaces.imp;

public class ChickenBurger extends BurgerImpl {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}