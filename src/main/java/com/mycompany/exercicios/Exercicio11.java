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
public class Exercicio11 {
    public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          int a = 0, maior = 0, menor = 0;
          
          for(int x = 0; x< 4; x++){
              System.out.println("Insira um valor:");
              a = scanner.nextInt();
              
              if(x == 0){
                  
                  maior = a;
                  menor = a;
              }
              
              if(a > maior){
                  
                  maior = a;
              }
              if(a < menor){
                  
                  menor = a;
              }             
          }
        System.out.println("Maior: "+ maior +"Menor: "+ menor);                                      
    }
}
