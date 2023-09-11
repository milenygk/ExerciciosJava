/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.ListaDeExercicios2_Vetor;

/**
 *
 * @author mileny.1948
 */
public class ExercicioVetor4 {
    public static void main(String[] args) {
    int[] vetorOriginal = {1, 2, 3, 4, 5};
    int tamanhoVetorOriginal = vetorOriginal.length;
    int[] vetorCopia = new int[tamanhoVetorOriginal];
    int tamanhoVetorOriginalZeroBased = tamanhoVetorOriginal -1;
    
    for(int i = 0; i < tamanhoVetorOriginal; i++){
        vetorCopia[i] = vetorOriginal[tamanhoVetorOriginalZeroBased - i];
        System.out.println(vetorCopia[i]);
    }
    }
}
