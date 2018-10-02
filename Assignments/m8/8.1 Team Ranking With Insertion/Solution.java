import java.util.*;
class Team implements Comparable<Team>{
	private String teamname;
	private int wins;
	private int loses;
	private int draws;

	Team(String teamname, int wins,int loses,int draws) {
		this.wins = wins;
		this.loses = loses;
		this.teamname = teamname;
		this.draws = draws;
	}
	public int getWins(){
	    return wins;
	}

	public void setWins(int wins){
	    this.wins = wins;

	}

	public String getTeamName(){
	  	return teamname;
	}
	 
	public void setTeamName(String teamname){
	  	this.teamname = teamname;
	}
	public int getLoses(){
	  	return loses;
	}
	 
	public void setLoses(int loses){
	  	this.loses = loses;
	}
	  
	public int getDraws(){
	   	return draws;
	}
	  
	public void setDraws(int draws){
	   	this.draws = draws;
	}

	public String toString(){
		return this.teamname;
	}
	public int compareTo(Team that){
		if (this.wins <that.wins) return -1;
		if (this.wins >that.wins) return  1;
		if (this.loses <that.loses)return -1;
		if (this.loses >that.loses)return 1;
		if (this.draws <that.draws)return -1;
		if (this.draws >that.draws)return 1;
		return 0;
	}
}
class Selection{
	public static void sort(Comparable[]a){
		int n = a.length;
		for (int i = 0;i<n;i++) {
			int min = i;
			for (int j = i+1;j<n;j++) {
				if (less(a[j],a[min])){
					min = j;
				}
			}
		exch(a, i, min);	
		}
		
	}

	private static boolean less(Comparable v, Comparable w){
		return v.compareTo(w)<0;
	}
	private static void exch(Comparable[] a,int i,int j){
		Comparable t = a[i];
		a[i] = a[j];
		a[j]= t;
	}

}
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
		for (Team team : teams) {
			System.out.println(team);
		}
	}

}