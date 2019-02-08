import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nstuds = Integer.parseInt(sc.nextLine());
		Student std = new Student(nstuds);
		for (int i = 0;i < nstuds;i++) {
			String[]tokens = sc.nextLine().split(",");
			// System.out.println(Arrays.toString(tokens));
			std.addStudent(new Student(Integer.parseInt(tokens[0]),tokens[1],(Integer.parseInt(tokens[2]))));
		}
		int quires = Integer.parseInt(sc.nextLine());
		int gquery = 0;
		for (int j = 0;j < quires;j++) {
			 gquery = Integer.parseInt(sc.nextLine());
			 std.getResult(gquery);
		}
		
	}

}