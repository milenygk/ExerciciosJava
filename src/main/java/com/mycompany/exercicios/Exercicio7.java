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
public class Exercicio7 {
      public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
          System.out.println("Digite um número para calcular o fatorial: ");
          int numero = scanner.nextInt();
          int[] resultado = calcularFatorial(numero);
          
          System.out.println("O fatorial de " + numero + " é: ");
          for(int i = resultado.length -1; i >= 0; i--){
              System.out.println(resultado[i]);
          }
          scanner.close();
      }
      public static int[] calcularFatorial(int numero){
          int tamanhoInicial = 1;
          int[] resultado = new int[tamanhoInicial];
          resultado[0] = 1;
          
          for(int i = 2; i <= numero; i++){
              resultado = multiplicaPorInteiro(resultado, i);
          }
          return resultado;
      }
      public static int[] multiplicaPorInteiro(int[] vetor, int multiplicador) {
          int tamanhoAtual = vetor.length;
          int carry = 0;
          
          for(int i = 0; i < tamanhoAtual; i++){
              int produto = vetor[i] * multiplicador + carry;
              vetor[i] = produto % 10;
              carry = produto / 10;
          }
          while (carry > 10){
              if(tamanhoAtual >= vetor.length){
                  int[] novoVetor = new int[tamanhoAtual + 1];
                  System.arraycopy(vetor, 0, novoVetor, 0, tamanhoAtual);
                  vetor = novoVetor;
              }
              vetor[tamanhoAtual] = carry % 10;
              carry /= 10;
              tamanhoAtual++;
          }
          return vetor;
      }
}
