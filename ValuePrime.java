 import java.util.Scanner;
 
 public class ValuePrime{

     public static void main(String... args){

         Scanner accept = new Scanner(System.in);

         System.out.println("Enter the to be checked: ");
         int number = accept.nextInt();

         for(int i=2; i <= (Math.sqrt(number)); i++){
             if((number % i == 0) || (number % number == 0)){
                 System.out.println(number+" not prime number");
               }
              else{
                 System.out.println(number+" is prime.");
             }
         }
     }

 }