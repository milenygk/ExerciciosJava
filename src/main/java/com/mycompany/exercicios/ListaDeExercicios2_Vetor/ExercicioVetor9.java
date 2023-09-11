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
public class ExercicioVetor9 {
     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String[] nomes = new String[10];
    
     nomes[0]  = "Mileny";
     nomes[1]  = "Jean";
     nomes[2]  = "Jorge";
     nomes[3]  = "Helena";
     nomes[4]  = "Aurora";
     nomes[5]  = "Pedro";
     nomes[6]  = "Luiz";
     nomes[7]  = "Carlos";
     nomes[8]  = "Laura";
     nomes[9]  = "Maria";
            
     System.out.println("Informe o nome: ");
     String nome = scanner.next(); 
     boolean naLista = false;
    
        for(int i = 0; i < nomes.length; i++){
            if(nomes[i].equals(nome)){
            naLista = true;
            System.out.println("O nome " + nome + " esta na lista!");
            break;
           }
        }
        
        if(naLista == false){
          System.out.println("O nome não está na lista.");
        }
     }
}
