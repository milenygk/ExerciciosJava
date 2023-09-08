/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.ListaDeExercicios2_Vetor;

/**
 *
 * @author mileny.1948
 */
public class ExercicioVetor3_ {
    public static void main(String[] args) {
    int qtdePosicoes = 5, maior;
    
    int[] vetor = new int[qtdePosicoes];
    
    vetor[0] = 1850;
    vetor[1] = 7;
    vetor[2] = 9;
    vetor[3] = 28;
    vetor[4] = 100;   
    
    maior = vetor[0];
    for(int i = 0; i < vetor.length; i++){
        if(vetor[i] > maior){
            maior = vetor[i];
               }
        }
        System.out.println("O maior numero da lista é: " + maior);
    }
}
