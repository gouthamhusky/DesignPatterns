package decorator.beverages;

import decorator.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 0;
    }
}
