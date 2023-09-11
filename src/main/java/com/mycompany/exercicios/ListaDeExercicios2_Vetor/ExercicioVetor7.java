/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.ListaDeExercicios2_Vetor;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mileny.1948
 */
public class ExercicioVetor7 {
     public static void main(String[] args) {
      List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5, 6);
      List<Integer> lista2 = Arrays.asList(2, 4, 6, 8, 10, 12); 
      
      int tamanhoTotal = lista1.size() + lista2.size();
              
      Integer[] vetor = new Integer[tamanhoTotal];
      
      for(int i = 0; i < lista1.size(); i++){
          vetor[i] = lista1.get(i);
      }
       for(int i = 0; i < lista2.size(); i++){
          vetor[lista1.size() + i] = lista2.get(i);
       }
         System.out.println("Vetor combinado: " + Arrays.toString(vetor));
    }     
}
