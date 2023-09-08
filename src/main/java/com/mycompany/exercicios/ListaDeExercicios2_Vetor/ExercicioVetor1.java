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
public class ExercicioVetor1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] numeros = new int[5];
     
    numeros[0] = 10;
    numeros[1] = 20;
    numeros[2] = 30;
    numeros[3] = 40;
    numeros[4] = 50;
    
    int soma = 0;
    for(int i = 0; i < 5; i++){
        soma = soma + numeros[i];
       }
        System.out.println(soma);
    } 
}
