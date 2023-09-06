/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicios;

import java.util.Scanner;

/**
 *
 * @author mileny.1948
 */
public class Exercicios {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        float num1, num2, num3, resultado;
        int opcao;
        
        System.out.println("informe a operação:");
        System.out.println("1 - SOMA");
        System.out.println("2 - SUBTRAÇÃO");
        System.out.println("3 - DIVISÃO");
        System.out.println("4 - MULTIPLICAÇÃO");
        opcao = scanner.nextInt(); 
        
        
       if(opcao == 1){
         System.out.println("Informe o primriro número;");
         num1 = scanner.nextInt();
        
         System.out.println("Informe o segundo número;");
        num2 = scanner.nextInt();
        
         System.out.println("Informe o terceiro número;");
         num3 = scanner.nextInt();
         
       resultado = num1 + num2 + num3;
        
        System.out.println("A soma dos valores é " + resultado);
   
       }else if(opcao == 2){
           System.out.println("Informe o primriro número;");
         num1 = scanner.nextInt();
        
         System.out.println("Informe o segundo número;");
        num2 = scanner.nextInt();
        
         System.out.println("Informe o terceiro número;");
         num3 = scanner.nextInt();
         
        resultado = num1 - num2 - num3;
        
        System.out.println("A subtração dos valores é " + resultado);
   
       }else if(opcao == 3){
           System.out.println("Informe o primriro número;");
         num1 = scanner.nextInt();
        
         System.out.println("Informe o segundo número;");
        num2 = scanner.nextInt();
        
         System.out.println("Informe o terceiro número;");
         num3 = scanner.nextInt();
         
        resultado = num1 / num2 / num3;
        
        System.out.println("A divisão dos valores é " + resultado);
        
       }else if(opcao == 4){
           System.out.println("Informe o primriro número;");
         num1 = scanner.nextInt();
        
         System.out.println("Informe o segundo número;");
        num2 = scanner.nextInt();
        
         System.out.println("Informe o terceiro número;");
         num3 = scanner.nextInt();
         
        resultado = num1 * num2 * num3;
        
        System.out.println("A multiplicação dos valores é " + resultado);
       }
    }
       }
       
