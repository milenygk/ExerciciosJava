/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios.ListaDeExercicios2_Vetor;

import java.util.Scanner;

/**
 *
 * @author mileny.1948
 */
public class ExercicioVetor2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int[] numeros = new int[5];
    
    numeros[0] = 50;
    numeros[1] = 40;
    numeros[2] = 30;
    numeros[3] = 20;
    numeros[4] = 10;
    
    int media = 0;
    for(int i = 0; i < 5; i++){
        media = (media + numeros[i]) /5;
        }
    System.out.println(media);
    }
}
