/**.
 * imports Scanner pAckage
 * @author :gvnaakhilsurya
 */
import java.util.Scanner;
/**.
 * { class for Solution }
 */
public final class Solution {
    /**.
     * Constructs the object.for solution class.
     */
    private Solution() {

    }
    /**.
     * In the main method we can take the input from the
     * input files and divides and performs the BST operations.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        BinarySearchT<Book, Integer> bst = new BinarySearchT<>();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(",");
            switch (tokens[0]) {
            case "put":
                Book book = new Book(tokens[1], tokens[1 + 1],
                                     Double.parseDouble(tokens[2 + 1]));
                bst.put(book, Integer.parseInt(tokens[2 + 2]));
                break;
            case "get":
                Book book1 = new Book(tokens[1], tokens[1 + 1],
                                      Double.parseDouble(tokens[2 + 1]));
                System.out.println(bst.get(book1));
                break;
            case "min":
                System.out.println(bst.min());
                break;
            case "max":
                System.out.println(bst.max());
                break;
            case "floor":
                Book book2 = new Book(tokens[1], tokens[1 + 1],
                                      Double.parseDouble(tokens[2 + 1]));
                System.out.println(bst.floor(book2));
                break;
            case "ceiling":
                Book book5 = new Book(tokens[1], tokens[1 + 1],
                                      Double.parseDouble(tokens[2 + 1]));
                System.out.println(bst.ceiling(book5));
                break;
            case "select" :
                System.out.println(
                    bst.select(Integer.parseInt(tokens[1])));
                break;
            default:
                break;
            }
        }
    }
}
