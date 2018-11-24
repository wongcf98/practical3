/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3;

/**
 *
 * @author Tarc
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node<String> node1 = new Node("DSA");
        Node<String> node2 = new Node("RSD", node1);

        for (Node temp = node2; temp != null; temp = temp.getNext()) {
            System.out.println(temp.getData());
        }
    }

}
