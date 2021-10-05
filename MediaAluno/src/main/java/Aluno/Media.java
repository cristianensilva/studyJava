
package Aluno;

import java.util.Scanner;

//Faça um programa que receba 3 notas de um aluno, calcule e mostre a média.

public class Media {
   
    public static void main (String[] args){
       
        Scanner input = new Scanner (System.in);
        
        double nota1, nota2, nota3, media;
       
        System.out.println("Nota1:");
        nota1 = input.nextDouble();
        
        System.out.println("Nota2:");
        nota2 = input.nextDouble();
        
        System.out.println("Nota3:");
        nota3 = input.nextDouble();      
        
        media = (nota1 + nota2 + nota3)/3;
        
        System.out.println("Média: " + media);
    
        if (media<3)
            System.out.println("Reprovado");
        else
            if (media<7)
                System.out.println("Exame");
            else
                System.out.println("Aprovado");
    }
}
