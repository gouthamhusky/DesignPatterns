package decorator.decorators;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }
}
