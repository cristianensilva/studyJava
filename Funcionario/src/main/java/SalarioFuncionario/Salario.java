/*
 Faça um programa que receba o código correspondente ao cargo de um funcionário 
 e seu salário atual, mostre o cargo, o valor do aumento e seu novo salário.
 */
package SalarioFuncionario;

import java.util.Scanner;

public class Salario {
    public static void main (String[] args){
    
        Scanner input = new Scanner(System.in);
        
        int codigo;
        double salario;
        double aumento = 0;
        double novosalario;
        String cargo = "";
        
        System.out.println("Código:");
        codigo = input.nextInt();
        
        System.out.println("Salário:");
        salario = input.nextDouble();
        
        switch (codigo){
            case 1:
                aumento = 0.50;
                cargo = "Escriturário";
                break;
                
            case 2:
                aumento = 0.35;
                cargo = "Secretário";
                break;
                
            case 3:
                aumento = 0.20;
                cargo = "Caixa";
                break;
                
            case 4:
                aumento = 0.10;
                cargo = "Gerente";
                break;
                
            case 5:
                aumento = 0;
                cargo = "Diretor";
                break;
            }
    
    aumento = salario * aumento;
    novosalario = salario + aumento;
    
    System.out.printf("Salário: %.2f \n", salario);
    System.out.printf("Aumento: %.2f \n", aumento);
    System.out.printf("Novo Salário: %.2f \n", novosalario);
    System.out.println("Cargo: "+ cargo);
    
    }
}
