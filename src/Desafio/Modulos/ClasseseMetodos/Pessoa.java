package Desafio.Modulos.ClasseseMetodos;

public class Pessoa {
   String nome;
   Double peso;

   Pessoa(String nome, Double peso) {
      this.nome = nome;
      this.peso = peso;
   }

   void comer(comida comida) {
      if (comida != null) {
         this.peso += comida.peso;
      }
   }

   String apresentar(){
      return "Olá sou o " + nome + " e peso "+ peso + "KGs.";
   }
}
