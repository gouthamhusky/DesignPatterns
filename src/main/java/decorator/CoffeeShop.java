package decorator;

import decorator.beverages.DarkRoast;
import decorator.beverages.Espresso;
import decorator.decorators.Mocha;
import decorator.decorators.Whip;

public class CoffeeShop {
    public static void main(String[] args) {

        Beverage b1 = new Espresso();
        System.out.println(b1.getDescription() + " $" + b1.cost());

        Beverage b2 = new DarkRoast();
        b2 = new Mocha(b2);
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println(b2.getDescription() + " $" + b2.cost());
    }
}
