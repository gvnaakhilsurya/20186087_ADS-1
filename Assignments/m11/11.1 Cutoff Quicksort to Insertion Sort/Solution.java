import java.util.Scanner;
/**.
 * Solution class
 */
public final class Solution {
    /**.
     * Constructs the object.
     *
     */
    private Solution() {
        //Unused Constructor.
    }
    /**.
     * main method.
     * In this method we read input from the input
     * files and then split into the tokens and then
     * passes as the parameters to the specified methods.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        Quicksort quick = new Quicksort();
        int noOfInputs = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < noOfInputs; i++) {
            int m = sc.nextInt();
            sc.nextLine();
            String[] input = sc.nextLine().split(" ");
            if (input[0].equals("")) {
                System.out.println("[]");
            } else {
                quick.sort(input, m);
            }
        }
    }
}

