package decorator.decorators;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.25 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }
}
