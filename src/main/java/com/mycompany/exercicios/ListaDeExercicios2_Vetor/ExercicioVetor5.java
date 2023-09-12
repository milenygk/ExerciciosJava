/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.ListaDeExercicios2_Vetor;

import java.util.Arrays;/**
 *
 * @author mileny.1948
 */
public class ExercicioVetor5 {
    public static void main(String[] args) {
         int[] vetor = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
         int[] numerosPares = filtrarNumerosPares(vetor);
         
         System.out.println("Numeros pares filtrados: " + Arrays.toString(numerosPares));
    }
    public static int[] filtrarNumerosPares(int[] vetor){
        int count = 0;
        for(int num : vetor){
            if(num % 2 == 0){
                count++;
            }
        }
        int[] numerosPares = new int[count];
        int index = 0;
        
        for(int num : vetor){
            if(num % 2 == 0){
                numerosPares[index] = num;
                index++;
            }
        }
        return numerosPares;
    }
}
