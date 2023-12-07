/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kat.liststackelements;

/**
 *
 * @author kathleentan
 */
public class StackFunctions {
    
    // 
    private String [] stack;  
    private int top;   
   
    public StackFunctions (int capacity) {
        stack = new String[capacity];
        top = 0;
    }
    
    // If user did not enter anything, sta
    public boolean empty() {
        return top == 0;
    }
    
    public void push(String input) {
        if (top == stack.length) {
           throw new StackOverFlowException();
        }
        else {
          stack[top] = input;
          top ++;           
        }         
    }
   
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
