import java.util.Scanner;
/**
 *@author :gvnaakhilsurya.
 * Solution class.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private  Solution() {

    }
    /**
     * It is the main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String tokens = sc.nextLine();
            String[] lines = tokens.split(",");
            MergeSort.sort(lines);
            System.out.println(MergeSort.show(lines));
            System.out.println();

        }
    }
}

