package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pizzaria");

        System.out.println("Marguerita:");
        IPizza marguerita=new Tomate(new Queijo(new MassaFina()));
        System.out.println(marguerita.getDescricao());

        System.out.println("Portuguesa:");
        IPizza portuguesa=new Tomate(new Ovo(new Queijo(new MassaEspessa())));
        System.out.println(portuguesa.getDescricao());
    }
}