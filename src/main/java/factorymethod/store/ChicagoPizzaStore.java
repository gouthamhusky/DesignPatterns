package factorymethod.store;

import factorymethod.factory.ChicagoPizzaIngredientFactory;
import factorymethod.factory.PizzaIngredientFactory;
import factorymethod.pizza.CheesePizza;
import factorymethod.pizza.ClamsPizza;
import factorymethod.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

    PizzaIngredientFactory ingredientFactory;

    public ChicagoPizzaStore() {
        ingredientFactory = new ChicagoPizzaIngredientFactory();
    }

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese"))
            return new CheesePizza(ingredientFactory);
        else if (type.equals("clams"))
            return new ClamsPizza(ingredientFactory);
        else return null;
    }
}
