import java.util.Scanner;
import java.util.Arrays;
/**.
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**.
     *
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
        while (sc.hasNext()) {
            sb.append(sc.nextLine() + "::");
    }
        String[] lines = sb.toString().split("::");
        int i = 0;
        Student[] students = new Student[lines.length];
        for (String line : lines) {
            String[]tokens = line.split(",");
            Student stud = new Student(tokens[6],
            (tokens[7]),
            Integer.parseInt(tokens[8]),
            Integer.parseInt(tokens[9]),
            Integer.parseInt(tokens[10]), 
            Integer.parseInt(tokens[11]),
            (tokens[12]));
            students[i++] = stud;
    }
        Selection.sort(students);
        // String output  = Arrays.toString(students);
        // output =
        //  output.replace("[", "").replace("]", "").replace(", ", ",");
        // System.out.println(output);
        System.out.println(Arrays.toString(students));
    }
    /**By analaysis the complexity of the above method is O(N^2).**/

}
