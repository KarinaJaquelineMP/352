package pkg2.pkg8.whilecuadrado;

import java.util.Scanner;

public class WHILECUADRADO {

    public static void main(String[] args) {
        
     Scanner entrada = new Scanner (System.in);
     int num, cuadrado;
     
     System.out.println("INTRODUZCA EL NUMERO");
     num= entrada.nextInt();
     while (num>=0){
         cuadrado =num *num;
         System.out.println("el cuadrado de "+ num+" es igual a"+ cuadrado);
         
         System.out.println("");
         System.out.println("introduzca otro numero");
         num=entrada.nextInt();
     }
    }
    
}