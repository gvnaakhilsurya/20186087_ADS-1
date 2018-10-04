import java.util.Scanner;
import java.util.Arrays;
/**.
 * Class for solution.
 */
class Solution {
	/**
	 * Constructs the object.
	 */
private Solution() {

}
/**.
 * { function_description }
 *
 * @param      args  The arguments
 */
public static void main(final String[] args) {
	/**.
	 * This method which delals with the main
	 * method of the three sum.
	 */

Scanner sc = new Scanner(System.in);
int inputs = sc.nextInt();
int[]numarry = new int[inputs];
for (int i = 0; i < inputs; i++) {
	numarry[i] = sc.nextInt();
}
Arrays.sort(numarry);
int count = 0;
for (int i = 0; i < inputs; i++) {
	for (int j = i + 1; j < inputs; j++) {
		int k = Arrays.binarySearch(numarry,
		 -(numarry[i] + numarry[j]));
		if (k > j) {
			count++;
		}
	}
}
 System.out.println(count);
}
}

