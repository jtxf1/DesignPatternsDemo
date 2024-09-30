package design.patterns.creational.builder;

import design.patterns.creational.builder.interfaces.imp.ChickenBurger;
import design.patterns.creational.builder.interfaces.imp.Coke;
import design.patterns.creational.builder.interfaces.imp.Pepsi;
import design.patterns.creational.builder.interfaces.imp.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}