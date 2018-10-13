class Stock {
	private String cmpyname;
	private float perchange;

	Stock(String cmpyname, float perchange) {
		this.cmpyname = cmpyname;
		this.perchange = perchange;
	}
	public String getCmpynm(){
	  return cmpyname;
	}
	 
	public void setCmpynm(String cmpyname){
	   this.cmpyname = cmpyname;
	}
	 public float getPerchange(){
	  return perchange;
	 }
	 
	 public void setPerchange(float perchange){
	  this.perchange = perchange;
	 }

	 public int compareTo(Stock that) {
		if( this.perchange > that.perchange) return +1;
		if (this.perchange<that.perchange) return 1;
		// return (this.cmpyname.ComapareTo(that.cmpnyname));
		return 0;
	}
	

}

 