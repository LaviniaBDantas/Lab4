package org.example;

public class PizzaDecorator implements IPizza{
    protected IPizza pizza;

    PizzaDecorator(IPizza pizza){
        this.pizza=pizza;
    }
    public String getDescricao() {
        return pizza.getDescricao();
    }


}
