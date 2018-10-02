class Team implements Comparable<Team>{
	/**.
	 * { var_description }
	 */
	private String teamname;
	private int wins;
	private int loses;
	private int draws;
	/**.
	 * { item_description }
	 */
	/**
	 * Constructs the object.
	 *
	 * @param      teamname  The teamname
	 * @param      wins      The wins
	 * @param      loses     The loses
	 * @param      draws     The draws
	 */
	Team(String teamname, int wins,int loses,int draws) {
		/**.
		 * { item_description }
		 */
		this.wins = wins;
		this.loses = loses;
		this.teamname = teamname;
		this.draws = draws;
	}
	/**.
	 * Gets the wins.
	 *
	 * @return     The wins.
	 */
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
	public int compareTo(Team that) {
		Team a = this;
		if (a.wins > that.wins) return 1;
		if (a.wins < that.wins) return -1;
		if (a.loses > that.loses) return -1;
		if (a.loses < that.loses) return 1;
		if (a.draws > that.draws) return 1;
		if (a.draws < that.draws) return -1; 
		return 0;
	}
}