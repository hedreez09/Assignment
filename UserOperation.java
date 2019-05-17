import java.util.Scanner;

//class of the code 
public class UserOperation{
    public static void main(String args[]){
        Scanner accept = new Scanner(System.in);

        System.out.println("Hi!\n here are the list of operation you can perform \n1)Addition \n2) Subtraction \n3) multiplication \n4) Divisio \n5) Modulus \n6) Power \n\n");

        System.out.println("Pls enter your first number");
        int number1  = accept.nextInt();
        System.out.println("Pls enter the operation you will like to perform on the numbers inputed");
        int operation = accept.nextInt();
        System.out.printf("%s%n", "Pls enter your second number");
        int number2  = accept.nextInt();
        


        if(operation == 1){
            int addition = number1 + number2;
            System.out.println("The addition of the numbers inputed is: "+ addition);
        
        }else if(operation == 2){
            int subtraction = number1 - number2;
             System.out.println("The subtraction of the numbers inputed is: "+ subtraction);

        }else if(operation == 3){
            int multiplication = number1 * number2;
             System.out.println("The multiplication of the numbers inputed is: "+ multiplication);

        }else if(operation == 4){
            double division = number1 / number2;
             System.out.println("The division of the numbers inputed is: "+ division);

        }else if(operation == 5){
            int modulus = number1 % number2;
             System.out.println("The modulus of the numbers inputed is: "+ modulus);

        }else if(operation == 6){
            int firstNumber = number1; 
            int secondNumber = number2;
            int result = 1;
            for(int i = 0; i < secondNumber; i++){
                result *= firstNumber ;
            }
            System.out.println("The power of Number1 "+ result);
        }

        else{
            System.out.println("invalid operation inputed");
        }

    }
}