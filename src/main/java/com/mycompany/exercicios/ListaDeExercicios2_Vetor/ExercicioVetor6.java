/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.ListaDeExercicios2_Vetor;

import static com.mycompany.exercicios.ListaDeExercicios2_Vetor.ExercicioVetor5.filtrarNumerosPares;
import java.util.Arrays;

/**
 *
 * @author mileny.1948
 */
public class ExercicioVetor6 {
    public static void main(String[] args) {
        int[] vetor = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int[] numerosImpares = filtrarNumerosImpares(vetor);
        
         System.out.println("Números Impares filtrados: " + Arrays.toString(numerosImpares));
    }
     public static int[] filtrarNumerosImpares(int[] vetor){
         int count = 0;
         for(int num : vetor){
             if(num % 2 != 0){
             count++;
         }
         }
         int[] numerosImpares = new int[count];
         int index = 0;
         
         for(int num : vetor){
         if(num % 2 != 0){
         numerosImpares[index] = num;
         index++;
              }
         }
         return numerosImpares;
     }
}
