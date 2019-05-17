
import java.util.Scanner;
public class RevString{

    //execution start from main method
    public static void main(String[] args){
         Scanner accept = new Scanner(System.in); //
         System.out.println("Enter any string of your choice: ");
         String gem = accept.nextLine(); // user string is is accepted here


        String reverse = ""; // empty storage for the reversed string

        for(int i = gem.length()-1; i >= 0; i--){ //the iteration start from the last character of the string with a step of -1 as long as i is not 0.
            reverse = reverse + gem.charAt(i); // the reverse status changes as the addition is done
        } 
        System.out.print("The reversed string is: ");
        System.out.println(reverse);   // after the whole iterative process, the reversed string is displayed here
    }
}