import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        private Node(int value) {
            this.value = value;
        }
    }


    public ArrayList<Integer> BFS() {
        Node currentNode = root; // root retrieved from constructor
        Queue<Node> queue = new LinkedList<>(); // Queue implemented using LinkedList which takes Node object
        ArrayList<Integer> results = new ArrayList<>(); // ArrayList created to take the value int field of Nodes
        queue.add(currentNode); // root added

        while (queue.size() > 0) {
            currentNode = queue.remove(); // node removed from queue
            results.add(currentNode.value); // int field of node added to arrayList
            if (currentNode.left != null) {
                queue.add(currentNode.left); // Node left field added to queue
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right); // Noode right field addd to queue
            }
            // repeaat the loop wheree queue will automatically remove the first item and it is assigned to currentNode
            // etc. until queue empty such that all int fields from nodes added into the linked list
        }
        return results;
    }

}

