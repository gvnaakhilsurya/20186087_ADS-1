import java.util.Scanner;
import java.util.Arrays;
/**.
 * Class for solution.
 */
public final class Solution {
    /**.
     *\
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**.
         * It is the main method which converts the given input into
         *  the array objects and pass as
         *   parameters as for the sorting class
         */
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        final int p = 3;
        while (sc.hasNext()) {
            sb.append(sc.nextLine() + "::");
    }
        String[] lines = sb.toString().split("::");
        int i = 0;
        Team[] teams = new Team[lines.length];
        for (String line : lines) {
            String[]tokens = line.split(",");
            Team team = new Team(tokens[0],
             Integer.parseInt(tokens[1]),
              Integer.parseInt(tokens[2]),
               Integer.parseInt(tokens[p]));
            teams[i++] = team;
    }
        InsertionSort.sort(teams);
        String output  = Arrays.toString(teams);
        output =
         output.replace("[", "").replace("]", "").replace(", ", ",");
        System.out.println(output);
    }
    /**By analaysis the complexity of the above method is O(N^2).**/

}
