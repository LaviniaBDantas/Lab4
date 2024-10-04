package org.example;

public class Decaf implements ICafe{
    @Override
    public String getDescricao() {
        return "\nCafé Descafeinado";
    }

    @Override
    public Double calcCusto() {
        return 2.00;
    }
}
