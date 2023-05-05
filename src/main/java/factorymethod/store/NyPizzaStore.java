package factorymethod.store;

import factorymethod.factory.NYPizzaIngredientFactory;
import factorymethod.factory.PizzaIngredientFactory;
import factorymethod.pizza.CheesePizza;
import factorymethod.pizza.ClamsPizza;
import factorymethod.pizza.Pizza;

public class NyPizzaStore extends PizzaStore{

    PizzaIngredientFactory pizzaIngredientFactory;

    public NyPizzaStore() {
        pizzaIngredientFactory = new NYPizzaIngredientFactory();
    }

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new CheesePizza(pizzaIngredientFactory);
        else if (type.equals("clams"))
            return new ClamsPizza(pizzaIngredientFactory);
        else return null;
    }
}
