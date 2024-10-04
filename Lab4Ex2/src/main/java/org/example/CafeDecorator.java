package org.example;

public class CafeDecorator implements ICafe{

    protected ICafe cafe;

    CafeDecorator(ICafe cafe){
        this.cafe=cafe;
    }
    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }

    @Override
    public Double calcCusto() {
        return cafe.calcCusto();
    }
}
