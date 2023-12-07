package kat.liststackelements;
import java.util.Scanner;
/**
 *
 * @author kathleentan
 */
public class ListStackElements {

    public static void main(String[] args) {
        
        // Scanner to get user input number for the stack.
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many names would you like to input?");
        int listSize = scnr.nextInt();
        
        // Creating stack with the class where the functions are.
        StackFunctions list = new StackFunctions(listSize);
        
        // Add items into the stack from user.
        for (int i = 0; i < listSize; i++) {
            System.out.println("Please enter a name!");
            list.push(scnr.next());
        }
        
        // Print out names put into the stack from the end.
        System.out.println("Here are the names you entered:");
        for (int i = 0; i < listSize; i++) {
            System.out.println(list.pop());
        }
 
    }
}
