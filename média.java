import java.util.Scanner;
public class média{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        Double Nota1 = sc.nextDouble();
        Double Nota2 = sc.nextDouble();
        double notafinal = Nota1 + Nota2;
        System.out.printf("nota final =  %1f%n" , notafinal);
        if (notafinal < 60.0) { 
            System.out.println("  Reprovado");
        }
        
       else {
        System.out.println("aprovado");
       }
       
          
        
          

sc.close();
    


    }
}
