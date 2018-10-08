import java.util.Scanner;

/**
 * Class for solution.
 */
public final class Solution {

    /**
     * Constructs the object.
     */
    private Solution() {

    }
    
    /**
     * This is the main method in this method we takes the input 
     * from the user and it splits in to the tokens and the passsed
     * to the various methods written in the Linked list class.
     *
     * @param      args  The arguments
     * 
     * By analysis the order od complexity of the main method
     * is O(N).
     * 
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int size = 0;
        /**
         * readind input from the input file and splitting
         * into tokens.
         */
        while (sc.hasNextLine()) {
            String[] tokens = sc.nextLine().split(" ");
            /**
             * writing switch case for the each token.
             */
            switch (tokens[0]) {
            case "insertAt":
                if (!ll.insertAt(Integer.parseInt(tokens[1]),
                    Integer.parseInt(tokens[2]))) {
                    size++;
                    System.out.println(ll.print());
                }
                break;
            case "reverse":
                if (size == 0) {
                    System.out.println("No elements to reverse.");
                    break;
                }
                ll.reverse();
                System.out.println(ll.print());
                break;
            default:
                break;
            }
        }
    }
}


