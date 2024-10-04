package org.example;

public class Chocolate extends CafeDecorator{

    Chocolate(ICafe cafe){
        super(cafe);
    }
    @Override
    public String getDescricao() {
        return cafe.getDescricao()+"\n+Chocolate";
    }

    @Override
    public Double calcCusto() {
        return super.calcCusto()+ 2.50;
    }
}
