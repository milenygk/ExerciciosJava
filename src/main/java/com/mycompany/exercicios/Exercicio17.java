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
public class Exercicio17 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
        float peso, altura, imc;
        
        System.out.println("Informe seu peso em kg: ");
        peso = scanner.nextFloat();        
        
        System.out.println("Informe sua altura: ");
         altura = scanner.nextFloat();   
         
         imc = peso / (altura * altura);
         
         System.out.println("Seu imc é: " + imc);
    }
}
