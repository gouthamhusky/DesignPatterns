package factorymethod.store;

import factorymethod.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.setName(type + "Pizza");
        pizza.bake();
        pizza.cut();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
