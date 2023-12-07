package kat.liststackelements;

/**
 *
 * @author kathleentan
 */
public class StackFunctions {
    
    // Creating array to store input values in the stack and top for pointing in the stack.
    private String [] stack;  
    private int top;   
   
    // Initializes stack with the value entered by the user.
    public StackFunctions (int capacity) {
        stack = new String[capacity];
        top = 0;
    }
    
    // If user did not enter anything, stack is empty.
    public boolean empty() {
        return top == 0;
    }
    
    // Points to top of the stack to add input.
    public void push(String input) {
        if (top == stack.length) {
           throw new StackOverFlowException();
        }
        else {
          stack[top] = input;
          top ++;           
        }         
    }
    
    // Finds the top of the stack to remove and return the values to then print out.
    public String pop() {
        if (empty()) {
           throw new EmptyStackException();
        }
        else {
          top--;
          return stack[top];
        }
    }
    
}
