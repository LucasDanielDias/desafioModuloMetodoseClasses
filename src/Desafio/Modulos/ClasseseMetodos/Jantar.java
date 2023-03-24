package Desafio.Modulos.ClasseseMetodos;

import java.util.Scanner;
public class Jantar{
    public static void main(String[]args) {
        comida c1 = new comida();
        c1.peso = 0.24;
        c1.nome = "Arroz";
        comida c2 = new comida();
        c2.nome = "Feijão";
        c2.peso = 0.31;
        Pessoa cliente = new Pessoa("João", 89.6);
        System.out.println(cliente.apresentar());
        cliente.comer(c1);
        System.out.println(cliente.apresentar());
    }
}
