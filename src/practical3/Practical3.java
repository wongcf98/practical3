/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3;

import java.util.Scanner;

/**
 *
 * @author Tarc
 */
public class Practical3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word:");
        String userInput = scanner.nextLine();

        ArrayStack stack = new ArrayStack();
        ArrayQueue queue = new ArrayQueue();

        for (int i = 0; i < userInput.length(); i++) {
            stack.push(userInput.charAt(i));
            queue.enqueue(userInput.charAt(i));
        }

        boolean polindrome = true;
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals(queue.dequeue())) {
                polindrome = false;
            }

        }
        if (polindrome) {
            System.out.println("The word is polindrom");
        }
        else
            System.out.println("The word is not polindrom");
    }
}
