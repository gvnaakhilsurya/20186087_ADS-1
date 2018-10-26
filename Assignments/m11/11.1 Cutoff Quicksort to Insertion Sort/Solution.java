import java.util.Scanner;
public final class Solution {
    /**
     * Constructs the object.
     *
     */
    private Solution() {
        //Unused Constructor.
    }
    /**
     * main.
     *
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