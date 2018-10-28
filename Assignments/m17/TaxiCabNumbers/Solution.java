import java.util.Scanner;
/**
 * Class for solution.
 */
class Solution {
	Solution () {

	}
	/**
	 * The main method reads the input from the
	 * input files and then passes 
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		System.out.println(Taxicab.findTaxicab(N,M));
	}	
}	



