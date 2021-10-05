/*
 * Faça um programa que leia vários números, encerrando quando o uduário digitar -1.
 * Calcule e mostre a soma e a média dos números digitados.
 */
package Numeros;

import java.util.Scanner;

public class Numeros {
    
    public static void main (String[] args){
        
        Scanner input = new Scanner (System.in);
        
        int num, soma = 0, count = 0;
        double media;
        
        System.out.println("Digite vários números (-1 encerra):");
                
                num = input.nextInt();
        
        while (num != -1){
            soma += num;
            count++;
            num = input.nextInt();
       }
        
        if (count != 0){
            media = (double) soma/count;
            System.out.println("Quantidade de números digitados: " + count);
            System.out.println("Soma dos números digitados: " + soma);
            System.out.println("Média dos números digitados: " + media);
        }
    }
}
