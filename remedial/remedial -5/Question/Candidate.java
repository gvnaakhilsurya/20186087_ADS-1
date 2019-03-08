import java.util.*;
class Candidate implements Comparable<Candidate>{
	int apid;
	String cname;
	String degree;
	double percent;

	public Candidate(int apid,String cname,String degree,double percent){
		this.apid = apid;
		this.cname = cname;
		this.degree = degree;
		this.percent = percent;
	}
	public Candidate(){

	}
	 public int getApid(){
	  return apid;
	 }
	 
	 public void setApid(int apid){
	  this.apid = apid;
	 }
	  public String getCname(){
	   return cname;
	  }
	  
	  public void setCname(String cname){
	   this.cname = cname;
	  }
	   public String getDegree(){
	    return degree;
	   }
	   
	   public void setDegree(String degree){
	    this.degree = degree;
	   }
	    public Double getPercent(){
	     return percent;
	    }
	    
	    public void setPercent(Double percent){
	     this.percent = percent;
	    }
	    public int compareTo(Candidate that){
	    	Candidate a = this;
	    	if (a.percent > that.percent) {
			return 1;
		}
		if (a.percent < that.percent) {
			return -1;
		}
		if (a.apid > that.apid) {
			return -1;
		}
		if (a.apid < that.apid) {
			return 1;
		}
		return 0;
	    }

	    public String toString(){
	    	return this.apid +","+ this.cname+","+this.degree +","+this.percent;
	    }
}