
package Sum;

import java.util.Scanner;

public class Soma {
    
    public static void main (String[] args){
      
        int num1, num2;
        char resp;
        
        Scanner input = new Scanner (System.in);        
        
        do{
            System.out.println("Informe 2 números:");
            num1 = input.nextInt(); 
            num2 = input.nextInt(); 
            System.out.println("Resultado da Soma: "+ (num1 + num2));
            System.out.println("Deseja continuar (s/n)?");
            resp = input.next().charAt(0);
        }while (resp == 's');

    }
}