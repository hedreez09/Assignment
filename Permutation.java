/**


 */

import java.util.Scanner;
public class Permutation{
    public static void main(String[] args){
        
        Scanner accept = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstInput = accept.nextInt();

        System.out.println("Enter the second number: ");
        int secondInput = accept.nextInt();

       int number=firstInput;
       int number2 = secondInput;
       int perm; 


        int fact = number;
        for(int i = 1; i < number; i++){
           int c = number - i;
            fact *= i;
        }
        //System.out.println(fact);
        int number3 = firstInput - secondInput;
        perm = number3;
        for(int j = 1; j < number3; j++){
            int d = number3 - j;
            perm *= d;
        }
        int result = fact/perm;

        System.out.println("The permutation of "+firstInput+" and "+secondInput+" = "+result);

    }
}