
package PRELIM;
import java.util.Scanner;



 public class Lab_Exercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        boolean u = true;
        while(u){
           
        }       
      
        
        System.out.println("Input the first number");
        int l= scanner.nextInt();
        
        System.out.println("input second number");
        int a = scanner.nextInt();
        
        System.out.println("input third number");
        int i = scanner.nextInt();
        
          int greatest= Math.max(Math.max(l,a),i);
        
        System.out.println("The Greatest number is:" +greatest);
      
        System.out.println("\nDo you want to enter a new number?(Yes/Nah");
        String response = scanner.next();
        if (response.equalsIgnoreCase("Nah")){
            u= false;
            System.out.println("\nProgram Ended");
            
        }
        
        
        
        
        
        
    }
    
}

    

