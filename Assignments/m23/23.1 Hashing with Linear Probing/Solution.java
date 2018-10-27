/**.
 * imports Scanner package
 */
import java.util.Scanner;
/**.
 * class for Solution
 */
public final class Solution {
    /**.
     * Constructs the object for Solution class.
     */
    private Solution() {

    }
    /**.
     * demonstraters the operations of Linear probing hash Symbol table
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int operations = sc.nextInt();
        //System.out.println(operations);
        sc.nextLine();
        LinearProbingHashST<String, Integer> hashst = new
                       LinearProbingHashST<String, Integer>();
        for (int i = 0; i < operations; i++) {
            String[] tokens = sc.nextLine().split(" ");
            switch (tokens[0]) {
            case "put":
                hashst.put(tokens[1], Integer.parseInt(tokens[2]));
                break;
            case "get":
                System.out.println(hashst.get(tokens[1]));
                break;
            case "delete":
                hashst.delete(tokens[1]);
                break;
            case "display":
                hashst.display();
                break;
            default:
                break;
            }
        }
    }
}
