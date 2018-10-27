import java.util.Scanner;
/**
 * Class for soution.
 */
public class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {

	}
	/**
	 * In this we takes the input from the user input
	 * and make it as tokens and then sent to the follwing
	 * classes we used. 
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int stdrecds = Integer.parseInt(sc.nextLine());
		BinarySearchST<Integer, Student> bst = new BinarySearchST<Integer, Student>(stdrecds);
		for (int i = 0; i < stdrecds; i++) {
			String line = sc.nextLine();
			String[]studata = line.split(",");
			bst.put(Integer.parseInt(studata[0]), new Student(studata[1], Double.parseDouble(studata[2])));
		}
		int mquires = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < mquires; i++) {
			String line = sc.nextLine();
			String[]qurdata = line.split(" ");
			if (qurdata[0].equals(BE)) {
				between(Double.parseDouble(qurdata[1]),Double.parseDouble(qurdata[2]));
			} else if (qurdata[0].equals(LE)){
				lesser(Double.parseDouble(qurdata[1]));
			} else(qurdata[0].equals(GE)) {
				greater(Double.parseDouble(qurdata[1]));
			}

	    }
	    public String[]between(double n) {
	    	return null;
	    }
	    public String[]lesser(double n) {
	    	return null;
	    }
	    public String[]greater(double n) {
	    	return null;
	    }

	}
}

			

