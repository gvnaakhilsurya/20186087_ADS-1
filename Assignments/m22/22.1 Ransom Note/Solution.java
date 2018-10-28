import java.util.Scanner;
/**
 * Class for solution.
 * @author : gvnaakhilsurya
 */
public class Solution {

	/**
	 * Constructs the object.
	 */
	private Solution() {

	}
	/**
	 * It is the min method which is used to
	 * read the input from the files and the divided into the
	 * tokens and pass as the arguments as the specified methods.
	 * By the analysis the time complexity of the below method isO().
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		/*This part is reding input from the input files and divied into
		tokens.*/
		Scanner sc = new Scanner(System.in);
		int nofwrdsinmagz = sc.nextInt();
		int nofwrdsinrnote = sc.nextInt();
		SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
		sc.nextLine();
		String[]magzwrds = sc.nextLine().split(" ");
		String[]rnotewrds = sc.nextLine().split(" ");
		/*This part is checking whether the words in the ransome note is
		 present or not*/
		for(int i = 0; i < magzwrds.length; i++) {
			if (st.contains(magzwrds[i])) {
				int count = st.get(magzwrds[i]);
				st.put(magzwrds[i], count+1);
			} else {
				st.put(magzwrds[i], 1);
			}
		}
		/*If it is their the frequency is reduced to one step and if it
		 is no their break the loop and then print No*/
		boolean flag = true;
		for (int i = 0;i < rnotewrds.length;i++) {
			if (st.contains(rnotewrds[i])) {
				int count = st.get(rnotewrds[i]);
				if (count == 0) {
					flag = false;
					break;
				}
				st.put(rnotewrds[i], count-1);
			} else {
				flag = false;
				break;
			}
		}
		if (flag == false)
			System.out.println("No");
		else
			System.out.println("Yes");
	}		
}
