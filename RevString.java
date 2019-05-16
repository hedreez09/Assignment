
import java.util.Scanner;
public class RevString{
    public static void main(String[] args){
         Scanner accept = new Scanner(System.in);
         System.out.println("Enther any string oof your choice: ");
         String gem = accept.nextLine();


        String reverse = ""; // storage for the reversed string

        for(int i = gem.length()-1; i >= 0; i--){ //
            reverse = reverse + gem.charAt(i);
        } 
        System.out.print("The reversed string is: ")
;        System.out.println(reverse);
    }
}