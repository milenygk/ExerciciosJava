/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author mileny.1948
 */
public class Exercicio23 {
     public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          String descProduto1 = "1 - Garrafa";
          String descProduto2 = "2 - Mouse";
          String descProduto3 = "3 - Caneta";
          float total =0;
          int produto, qtd;
          
          float vlrProd1 = (float)15.50;
          float vlrProd2 = (float) 200.00;
          float vlrProd3 = (float)20.99;
          
          System.out.println("Selecione o produto da lista");
          System.out.println(descProduto1 + "| " + vlrProd1);
          System.out.println(descProduto2 + "| " + vlrProd2);
          System.out.println(descProduto3 + "| " + vlrProd3);
          produto = scanner.nextInt();
          
          System.out.println("Qual quantidade do produto, " + produto + " voce deseja?");
          qtd = scanner.nextInt();
          
          if(produto == 1){
              total = qtd * vlrProd1;
              
          }else if(produto == 2){
              total = qtd * vlrProd2;
              
          }else if(produto == 3){
              total = qtd * vlrProd3;
          }
          System.out.println("Compra do produto: " + produto + " no valor de: R$" + total);
          
     }
}
