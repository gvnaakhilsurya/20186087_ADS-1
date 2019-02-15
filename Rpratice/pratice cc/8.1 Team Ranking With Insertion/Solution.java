import java.util.*;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Insertion in = new Insertion();
		// Selection sel = new Selection();
		   // Merge m = new Merge();
		// Quick q = new Quick();

		Team t = new Team();
		StringBuffer sb = new StringBuffer();
		while(sc.hasNext()){
			sb.append(sc.nextLine() + ":");
		}
		// System.out.println(sb);
		int tsize = 0;
		String[]parts = sb.toString().split(":");
		Team[] team = new Team[parts.length];
		for (int i = 0;i < parts.length;i++) {
			String[]tokens = parts[i].split(",");
			// System.out.println(Arrays.toString(tokens));
			team[tsize++] = new Team(tokens[0],Integer.parseInt(tokens[1]),
				Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]));
		}
		in.sort(team);
		// sel.sort(team);
		String str = Arrays.toString(team);
		String res = "";
		res = str.replaceAll("\\s+","").replace("]", "").replace("[","");
		System.out.println(res);
	}

}

class Team implements Comparable<Team>{
	private String tname;
	private int nwins;
	private int nloss;
	private int ndrws;
	public Team(String tname,int nwins, int nloss, int ndrws){
		this.tname = tname;
		this.nwins = nwins;
		this.nloss = nloss;
		this.ndrws = ndrws;
	}
	public Team(){

	}
	 public String toString(){
	 	return this.tname;
	 }
	 public int compareTo(Team that){
	 	Team a = this;
	 	if (a.nwins > that.nwins) return -1;
		if (a.nwins < that.nwins) return 1;
		if (a.nloss > that.nloss) return 1;
		if (a.nloss < that.nloss) return -1;
		if (a.ndrws > that.ndrws) return -1;
		if (a.ndrws < that.ndrws) return 1; 
	 	return 0;
	 }


}