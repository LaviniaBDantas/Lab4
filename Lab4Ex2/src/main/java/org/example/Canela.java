package org.example;

public class Canela extends CafeDecorator{
    Canela(ICafe cafe){
        super(cafe);
    }
    @Override
    public String getDescricao() {
        return super.getDescricao()+"\n+Canela";
    }

    @Override
    public Double calcCusto() {
        return super.calcCusto()+0.50;
    }
}
