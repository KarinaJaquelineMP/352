package caseswitch;

import java.util.Scanner;


public class CaseSwitch {
       //Definicion de Variables.
     public static double PV =0;
     public static Scanner entrada = new Scanner(System.in);
     public static double descuento=0;
     public static double preciofinal = 0;
     public static String codPromocion;
     public static int compras =0;
     //////MAIN//////    
public static void main(String[] args) {
Compra();
ProcesoCase();
       
       
    }
 public static void Compra(){
//variable de ciclo
int c1=1;     
//Ingresar compras
   
 System.out.println("Ingresa el total de compras realizadas");
 compras = entrada.nextInt();
 // Ingresar montos 
while (c1<=compras)
{
 System.out.println("Ingresa los montos");
 PV = PV + entrada.nextDouble(); 
 c1++;
}
}
public static void ProcesoCase()
{
 //Entrada de Datos
       System.out.println("Su total de compra es: $"+ PV + "\n");
       System.out.println("Tines un codigo de descuento Escribelo:");
       codPromocion = entrada.next();     
        //Salida de Datos
        
        switch(codPromocion){
            case  "PlatiOctubre":
          descuento = (PV*.20);
            preciofinal = (PV-descuento);
                break;
            case  "SilverOctubre":  
             descuento = (PV*.50);
                preciofinal = (PV-descuento);
                    break;
            case "BronceOctubre":
              descuento = (PV*.35);
                preciofinal = (PV-descuento);
                    break;
            case "OroOctubre":
               descuento = (PV*.75);
                   preciofinal = (PV-descuento);
                    break;
        default:
    preciofinal = PV;
       
        }
        //salida de precio final
      System.out.println("Descuento aplicado " + "$"+descuento);
      System.out.println("costo final " + "$"+ preciofinal);   
}


}
