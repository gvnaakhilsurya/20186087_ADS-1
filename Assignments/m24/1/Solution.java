import java.util.Scanner;
import java.util.HashMap;
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
		HashMap<Integer, Student> hmap = new HashMap<Integer, Student>(stdrecds);
		for (int i = 0; i < stdrecds; i++) {
			String line = sc.nextLine();
			String[]studata = line.split(",");
			hmap.put(Integer.parseInt(studata[0]), new Student(studata[1], Double.parseDouble(studata[2])));
		}
		int mquires = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < mquires; i++) {
			String line = sc.nextLine();
			String[]qurdata = line.split(" ");
			  Student student = hmap.get(Integer.parseInt(qurdata[1]));
			if(student == null){
                System.out.println("Student doesn't exists...");
            } else if(qurdata[2].equals("1")) {

                    System.out.println(student.getName());

            } else if(qurdata[2].equals("2")) {
                System.out.println(student.getTotalmarks());
            }
		}
			
		}
	}
