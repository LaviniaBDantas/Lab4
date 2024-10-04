package org.example;

public class Queijo extends PizzaDecorator{
    Queijo(IPizza pizza) {
        super(pizza);

    }

    @Override
    public String getDescricao() {
        return super.getDescricao()+"\n+Queijo";
    }
}
