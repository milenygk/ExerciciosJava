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
public class Exercicio18 {
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in); 
     int jan = 31,
         fev = 28,
         mar = 31,
         abr = 30,
         mai = 31,    
         jun = 30,
         jul = 31,
         ago = 31,
         set = 30,
         out = 31,
         nov = 31,
         dez = 31;  
     
     String opcao;
     
     System.out.println("Informe o mês: ");
     System.out.println("JANEIRO");
     System.out.println("FEVEREIRO");
     System.out.println("MARÇO");
     System.out.println("ABRIL");
     System.out.println("MAIO");
     System.out.println("JUNHO");
     System.out.println("JULHO");
     System.out.println("AGOSTO");
     System.out.println("SETEMBRO");
     System.out.println("OUTUBRO");
     System.out.println("NOVEMBRO");
     System.out.println("DEZEMBRO");
                 
     opcao = scanner.next();
     
     if(opcao.equals("JANEIRO")){
         System.out.println("O mes de janeiro tem " + jan + " dias.");
     
     }else if(opcao.equals("FEVEREIRO")){
         System.out.println("O mes de fevereiro tem " + fev + " dias.");
     
     }else if(opcao.equals("MARÇO")){
         System.out.println("O mes de março tem " + mar + " dias.");
     
     }else if(opcao.equals("ABRIL")){
         System.out.println("O mes de abril tem " + abr + " dias.");
     
     }else if(opcao.equals("MAIO")){
         System.out.println("O mes de maio tem " + mai + " dias.");
     
     }else if(opcao.equals("JUNHO")){
         System.out.println("O mes de junho tem " + jun + " dias.");
     
     }else if(opcao.equals("JULHO")){
         System.out.println("O mes de julho tem " + jul + " dias.");
     
     }else if(opcao.equals("AGOSTO")){
         System.out.println("O mes de agosto tem " + ago + " dias.");
     
     }else if(opcao.equals("SETEMBRO")){
         System.out.println("O mes de setembro tem " + set + " dias.");
     
     }else if(opcao.equals("OUTUBRO")){
         System.out.println("O mes de outubro tem " + out + " dias.");
     
     }else if(opcao.equals("NOVEMBRO")){
         System.out.println("O mes de novembro tem " + nov + " dias.");
     
     }else
         System.out.println("O mes de dezembro tem " + dez + " dias.");
     
     }
     }

