class Team implements Comparable<Team>{
	/**.
	 * It is the team class which implements the
	 *  interface of the Comparable class.
	 */
	private String teamname;
	private int wins;
	private int loses;
	private int draws;
	/**.
	 * The above are attribuites which are used in the 
	 * class.They are declared.
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
		 * The attribuites are intialized in the counstructor.
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
	/**
	 * Sets the wins.
	 *
	 * @param      wins  The wins
	 */

	public void setWins(int wins){
	    this.wins = wins;

	}
	/**
	 * Gets the team name.
	 *
	 * @return     The team name.
	 */

	public String getTeamName(){
	  	return teamname;
	}
	/**
	 * Sets the team name.
	 *
	 * @param      teamname  The teamname
	 */
	 
	public void setTeamName(String teamname){
	  	this.teamname = teamname;
	}
	/**
	 * Gets the loses.
	 *
	 * @return     The loses.
	 */
	public int getLoses(){
	  	return loses;
	}
	/**
	 * Sets the loses.
	 *
	 * @param      loses  The loses
	 */
	 
	public void setLoses(int loses){
	  	this.loses = loses;
	}
	/**
	 * Gets the draws.
	 *
	 * @return     The draws.
	 */
	  
	public int getDraws(){
	   	return draws;
	}
	/**
	 * Sets the draws.
	 *
	 * @param      draws  The draws
	 */
	  
	public void setDraws(int draws){
	   	this.draws = draws;
	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @return     String representation of the object.
	 */

	public String toString(){
		return this.teamname;
		/**By analaysis the complexity of the above method is O(1).
	}
	/**
	 * 
	 *
	 * @param      that  The that
	 *
	 * @return    the integer value which decides the min value
	 */
}
	public int compareTo(Team that){
		/**
		 * This method is used for the sorting of the elements.
		 */
		if (this.wins >that.wins) return -1;
		if (this.wins <that.wins) return  1;
		if (this.loses <that.loses)return -1;
		if (this.loses >that.loses)return 1;
		if (this.draws >that.draws)return -1;
		if (this.draws <that.draws)return 1;
		return 0;
		/** By analaysis the complexity of the above method is O(1).**/
	}
}