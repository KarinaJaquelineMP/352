import java .utill.Scanner;
public class JavaApplication77{
public static void main (String[]ang){
    public static String retornarMultiplo(int num){
//Declaracion de variables
        Scanner entrada = new Scanner (System.in);
        int numero;
        //Entrada de datos
        System.out.println("Dame el numero: ");
        numero = entrada.nextInt();
        //Salida de datos
        System.out.println(retornaMultiplo(numero));
    }
    
    public static String retornaMultiplo(int num){
        //Declaracion de variables
        int mult3;
        int mult5;
        //Procesamiento de datos
        mult3 = num % 3 ;
        mult5 = num % 5 ;
        //Salida de datos
        if (mult3 == 0 && mult5 == 0){
            return "TRIFIV";
        } else if (mult3==0){
            return "Tri";
        } else if (mult5==0){
            return "Fiv";
        }
        return "Ningun caso";
    }
}