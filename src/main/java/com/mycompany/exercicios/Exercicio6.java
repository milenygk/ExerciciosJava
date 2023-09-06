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
public class Exercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num, cont = 1, resultado;
        
        System.out.println("Informe o número:");
        num = scanner.nextInt();
        
        while(cont <= 10){
            resultado = num * cont;
            System.out.println(num + " x " + cont + " = " + resultado);
            cont++;
        }
    }
 
}
