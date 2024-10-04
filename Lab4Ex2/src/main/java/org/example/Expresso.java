package org.example;

public class Expresso implements ICafe{
    @Override
    public String getDescricao() {
        return "\nCafé expresso";
    }

    @Override
    public Double calcCusto() {
        return 3.00;
    }
}
