import java.util.Scanner;
import java.util.Arrays;
/**.
 * Class for solution.
 */
public class Solution{
	/**.
	 * \
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		/**.
		 * It is the main method which converts the given input into
		 *  the array objects and pass as parameters as for the sorting class
		 */
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while (sc.hasNext()){
			sb.append(sc.nextLine()+"::");
		}
		String []lines = sb.toString().split("::");
		int i = 0;
		Team[] teams = new Team[lines.length];
		for (String line : lines) {
			String[]tokens = line.split(",");
			Team team = new Team(tokens[0],Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]));
			teams[i++] = team;
		}
		InsertionSort.sort(teams);
		String output  = Arrays.toString(teams);
		output = output.replace("[","").replace("]","").replace(", ", ",");
		System.out.println(output);
	}
	/**By analaysis the complexity of the above method is O(N^2).**/

}