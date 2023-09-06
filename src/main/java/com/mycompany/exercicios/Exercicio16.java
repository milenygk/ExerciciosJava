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
public class Exercicio16 {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
        float nota1, nota2, nota3, media;
        
         System.out.println("Insira a primeira nota: ");
         nota1 = scanner.nextFloat();
         
         System.out.println("Insira a segunda nota: "); 
          nota2 = scanner.nextFloat();
         
         System.out.println("Insira a terceira nota: "); 
          nota3 = scanner.nextFloat();
          
          media = (nota1 + nota2 + nota3) /3;
          
          System.out.println("A media das notas é: " + media);
          
          if(media < 6){
              System.out.println("REPROVADO"); 
          }else
             System.out.println("APROVADO");  
          
     }
}
