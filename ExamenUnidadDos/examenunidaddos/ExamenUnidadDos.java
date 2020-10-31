package examenunidaddos;
import java.util.Scanner;

 public class ExamenUnidadDos {

     public static void main(String[] args) {
         // TODO code application logic here
         int [] ejemplo =new int[10];
         int i;
         Scanner leer=new Scanner(System.in);
        
         for(i=0; i< ejemplo.length; i++){
            System.out.println("Introduce un número: ");
            ejemplo[i]=leer.nextInt();
         }
        
        for(i=0;i<ejemplo.length; i++){
           if(ejemplo[i]%2==0){
               System.out.println(ejemplo[i]);
           }
           else{
           }if(ejemplo[i]%2!=0){
               System.out.println(ejemplo[i]);
           }
        }
     
    }
     public boolean impar(int n){
        if(n==0){
            return false;
        }else{
            return par(n-1);
        }
     }
     
     public boolean par(int n){
         if(n==0){
             return true; 
         }else{
             return impar(n-1);
         }
     }
     
    
}
