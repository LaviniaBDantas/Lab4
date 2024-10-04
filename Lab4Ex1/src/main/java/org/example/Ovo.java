package org.example;

public class Ovo extends PizzaDecorator {
    Ovo(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao()+"\n+Ovo";
    }
}
