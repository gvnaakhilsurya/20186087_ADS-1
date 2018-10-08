import java.util.Scanner;
/**
 * Class for solution.
 */
public final  class Solution {
    /**.
    * Constructs the object.
    */
    private Solution() {
        /**.
         * It is a counstructor.
         */
    }
    /**.
     * It is the main method in this method,in this we can
     * take the input from the user and convert in to the array of
     * the eelements depends upon the various data types.
     * By the analysis the complexity of the method is O(N^2).
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        switch (key) {
            /**
             * When the key value is String this case will
             * executes.
             */
            case "String":
            while (n > 0) {
                String[] tokens = sc.nextLine().split(",");
                MinHeap min = new MinHeap(tokens);
                System.out.println(min.IsMinHeap());
                n--;
            }
            break;
            /**
             * When the key value is Integer this case will
             * executes.
             */
            case "Integer":
            while (n > 0) {
            String[] tokens = sc.nextLine().split(",");
            Integer[] inttokens = new Integer[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                inttokens[i] = Integer.parseInt(tokens[i]);
            }
            MinHeap min = new MinHeap(inttokens);
            System.out.println(min.IsMinHeap());
            n--;
        }
            break;
            /**
             * When the key value is Float this case will
             * executes.
             */
            case "Float":
            while (n > 0) {
            String[] tokens = sc.nextLine().split(",");
            Float[] floattokens = new Float[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                floattokens[i] = Float.parseFloat(tokens[i]);
                if (floattokens[i] < 0) {
                    System.out.println(false);
                    
                }
            }

            MinHeap min = new MinHeap(floattokens);
            System.out.println(min.IsMinHeap());
            n--;
        }
        break;
        /**
         *
         *When the key value is Double this case will
         * executes.
         */

        case "Double":
            while (n > 0) {
            String[] tokens = sc.nextLine().split(",");
            Double[] doubletokens = new Double[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                doubletokens[i] = Double.parseDouble(tokens[i]);
            }
            MinHeap min = new MinHeap(doubletokens);
            System.out.println(min.IsMinHeap());
            n--;
        }
        break;
        default:
        break;
        }
    }
}
