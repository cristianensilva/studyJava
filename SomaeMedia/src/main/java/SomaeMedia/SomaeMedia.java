/*
 * Faça um programa que leia 10 números.
 * Calcule e mostre a soma e a média dos números digitados.
 */
package SomaeMedia;

import java.util.Scanner;

public class SomaeMedia {
    
    public static void main (String[] args){
        
        Scanner input = new Scanner (System.in);
        
        int num;
        int soma = 0;
        double media;
        
        System.out.println("Digite 10 números:");
        
        for (int i = 0; i < 10; i++){
            num = input.nextInt();
            soma += num;
        }
        
        media = (double)soma/10;
        
        System.out.println("Soma dos números digitados: " + soma);
        System.out.println("Média dos números digitados: " + media);
    }
}
