package holamundo;

public class fortablas {
    public static void main(String[] args){
        //TODO code application logit here
        int i,j ;
        for (i=1; i<=10; i++){
            System.out.println("Tabla del" +i);
            System.out.println("-------------");
            for(j=1; j<=10; j++){
             System.out.println(i + "x" + j + " = " + j*i);
            }
        }
    }
    
}
