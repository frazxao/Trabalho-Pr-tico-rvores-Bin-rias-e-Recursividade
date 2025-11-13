package br.edu.estruturasdados.arvore;


//Main.java
//Testa a implementação da ArvoreBinaria

public class Main {
 public static void main(String[] args) {
     ArvoreBinaria arvore = new ArvoreBinaria();

     // Inserindo valores
     int[] valores = {50, 30, 70, 20, 40, 60, 80};
     System.out.print("Inserindo valores: ");
     for (int v : valores) {
         System.out.print(v + " ");
         arvore.inserir(v);
     }
     System.out.println();

     // Exibindo percursos
     System.out.print("Em ordem: ");
     arvore.imprimirEmOrdem(); // deve mostrar 20 30 40 50 60 70 80

     System.out.print("Pré-ordem: ");
     arvore.imprimirPreOrdem(); // deve mostrar 50 30 20 40 70 60 80

     System.out.print("Pós-ordem: ");
     arvore.imprimirPosOrdem(); // deve mostrar 20 40 30 60 80 70 50

     // Testes de busca
     int busca1 = 60;
     int busca2 = 25;
     System.out.println("Buscar " + busca1 + ": " + (arvore.buscar(busca1) ? "encontrado (true)" : "não encontrado (false)"));
     System.out.println("Buscar " + busca2 + ": " + (arvore.buscar(busca2) ? "encontrado (true)" : "não encontrado (false)"));
 }
}

