import java.util.Scanner;
/**
 * Class for solution.
 */
class Solution {
	/**
	 * Constructs the object.
	 */
	Solution() {
		/**
		 * { item_description }
		 */

	}
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String testcasesno = sc.nextLine();
		while(sc.hasNext()) {
			String[] line = sc.nextLine().split(",");
			int people = Integer.parseInt(line[0]);
			int gap = Integer.parseInt(line[1]);
			Deque<Integer>dq = new Deque();
			createcircle(dq,people);
			dq.josephus(people,gap);
		}

	}
	/**
	 * { function_description }
	 *
	 * @param      dq      { parameter_description }
	 * @param      people  The people
	 */
	public static void createcircle(Deque<Integer> dq, int people) {
		for (int i = 0; i < people; i++) {
			dq.push(i);
			
		}
		
	}

}