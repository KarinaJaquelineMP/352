//Importar
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {
//Variables
public static int a;    

    public static void main(String[] args) {
Calificaciones();
}
   public static void Calificaciones() {
 //Entrada de datos con viento        
Scanner Guardado =new Scanner(System.in);
            System.out.println("Dame la calificacion");
                 a = Guardado.nextInt();    
    
//Prceso de datos

//Salida
      switch(a){
            case 0:
        System.out.println("Muy Mal");
        break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
        System.out.println("Insuficiente");
        break;
            case 6:
        System.out.println("Suficiente");      
        break;
             case 7:
             case 8:
        System.out.println("Bien");  
        break;
             case 9:
        System.out.println("Notable");  
        break;
             case 10:
        System.out.println("Sobre Saliente");
        break;
        
             default:
        System.out.println("Error de Calificacion");
        break;
                 
        }        
    }

    
}