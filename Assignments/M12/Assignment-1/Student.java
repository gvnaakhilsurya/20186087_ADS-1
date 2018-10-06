class Student implements Comparable{
	private String stnm;
	private String dob;
	private int sub1mrks;
	private int sub2mrks;
	private int sub3mrks;
	private int totalmrks;
	private String reservcatg;
	Student(String stnm,String dob, int sub1mrks, int sub2mrks, int sub3mrks,int totalmrks,String reservcatg) {
		this.stnm = stnm;
		this.dob = dob;
		this.sub1mrks = sub1mrks;
		this.sub2mrks = sub2mrks;
		this.sub3mrks = sub3mrks;
		this.totalmrks = totalmrks;
		this.reservcatg = reservcatg;
	}
	public String getStnm(){
	   return stnm;
	}
	 
	public void setStnm(String stnm){
	   this.stnm = stnm;
	}
	public String getDob(){
	   return dob;
	}
	  
	public void setDob(String dob){
	   this.dob = dob;
	}
	public int getSub1mrks(){
	    return sub1mrks;
	}
	   
	public void setSub1mrks(int sub1mrks){
	    this.sub1mrks = sub1mrks;
	}
	public int getSub2mrks(){
	    return sub2mrks;
	}
	    
	public void setSub2mrks(int sub2mrks){
	    this.sub2mrks = sub2mrks;
	}
	public int getSub3mrks(){
	    return sub3mrks;
	}
	     
	public void setSub3mrks(int sub3mrks){
	    this.sub3mrks = sub3mrks;
	}
	 public int getTotalmrks(){
	   return totalmrks;
	}
	 
	public void setTotalmrks(int totalmrks){
	   this.totalmrks = totalmrks;
	}
	public String getReservecatg(){
	   return reservcatg;
	}
	 
	public void setReservecatg(String reservcatg){
	   this.reservcatg = reservcatg;
	}
	public String toString(){
		return this.stnm +","+this.totalmrks;
	}
	public int compareTo(Student that) {
		/**
		 * This method is used for sorting the values of the given data.
		 */
		 Student a = this;
		if (a.totalmrks > that.totalmrks) return 1;
		if (a.totalmrks < that.totalmrks) return -1;
		if (a.sub3mrks > that.sub3mrks) return 1;
		if (a.sub3mrks < that.sub3mrks) return -1;
		if (a.sub2mrks > that.sub2mrks) return 1;
		if (a.sub2mrks < that.sub2mrks) return -1; 
		return 0;
		
	}
	 class Date implements Comparable<Date>{

		 private int month, day, year;
		 public Date(int m, int d, int y){
		 month = m;
		 day = d;
		 year = y;
	}
		public int compareTo(Date b) {

			 Date a = this;
			 if (a.year < b.year ) return -1;
			 if (a.year > b.year ) return +1;
			 if (a.month < b.month) return -1;
			 if (a.month > b.month) return +1;
			 if (a.day < b.day ) return -1;
			 if (a.day > b.day ) return +1;
			 return 0;
  }

}

}

