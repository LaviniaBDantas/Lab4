package org.example;

public class Tomate extends PizzaDecorator {
    Tomate(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao()+"\n+Tomate";
    }
}
