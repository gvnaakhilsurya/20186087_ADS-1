import java.util.*;
public class Candidate {
	double rno;
	double percentil;
	// Constructor
	public Candidate(double rno,double percentil){
		this.rno = rno;
		this.percentil = percentil;
		
	}
	 public Double getPercentil(){
	  return percentil;
	 }
	 
	 public void setPercentil(Double percentil){
	  this.percentil = percentil;
	 }
	
}