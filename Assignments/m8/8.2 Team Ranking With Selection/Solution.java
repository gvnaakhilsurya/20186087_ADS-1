import java.util.*;
public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		while(sc.hasNext()){
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
		Selection.sort(teams);
		String output  = Arrays.toString(teams);
		output = output.replace("[","").replace("]","").replace(", ", ",");
		System.out.println(output);
	}

}