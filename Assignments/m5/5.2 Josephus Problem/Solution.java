import java.util.Scanner;
/**.
 *@author:gvnaakhilsurya.
 * Class for solution.
 */
public final class Solution {
	/**.
	 * Constructs the object.
	 */
	private Solution() {

	}
	/**
	 * In the main method we can divide the given
	 * input files into the tokens and the passes
	 * through the arguments as the specified methods.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		String testcases = sc.nextLine();
		while (sc.hasNext()) {
			String[] line = sc.nextLine().split(" ");
			int people = Integer.parseInt(line[0]);
			int gap = Integer.parseInt(line[1]);
			Deque<Integer> q = new Deque<>();
			createCircle(q, people);
			q.josephus(people, gap);
		}
	}

	/**
	 * Creates a circle.
	 *
	 * @param      q       The quarter
	 * @param      people  The people
	 */
	public static void createCircle(final Deque<Integer> q,
	 final int people) {
		for (int i = 0; i < people; i++) {
			q.push(i);
		}
	}
}
