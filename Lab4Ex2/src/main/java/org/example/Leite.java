package org.example;

public class Leite extends CafeDecorator{

    Leite(ICafe cafe){
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao()+"\n+Leite";
    }

    @Override
    public Double calcCusto() {
        return super.calcCusto()+1.00;
    }
}
