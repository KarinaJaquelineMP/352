package pkg2.pkg7.forfactorial;
import java.util.Scanner;
public class FORFACTORIAL {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double factorial;
        int num;
        System.out.println("INTRODUCE EL NUMERO:");
        num = entrada.nextInt();
        factorial = 1;
        for(int i=num; i > 0; i--){
        factorial=factorial*i;
        
    }
     System.out.println("el factorial de "+ factorial);
    }
    
}
