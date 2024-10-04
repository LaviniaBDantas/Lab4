package org.example;

public class Cafeteria {
    public static void main(String[] args) {

        System.out.println("Bem vindo a cafeteria!");
        ICafe pedido = new Canela(new Chocolate(new Expresso()));
        System.out.println(pedido.getDescricao());
        System.out.println("Total:");
        System.out.println(pedido.calcCusto());

        ICafe pedido2 = new Leite(new Chocolate(new Decaf()));
        System.out.println(pedido2.getDescricao());
        System.out.println("Total:");
        System.out.println(pedido2.calcCusto());
    }
}