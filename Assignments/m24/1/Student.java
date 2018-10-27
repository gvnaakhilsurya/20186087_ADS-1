class Student {
	private int rollno;
	private String name;
	private double totalmarks;

	Student(int rollno, String name, double totalmarks) {
		this.rollno = rollno;
		this.name = name;
		this.totalmarks = totalmarks;
	}
	Student(String name, double totalmarks) {
		this.name = name;
		this.totalmarks = totalmarks;
	}
	 public int getRollno(){
	  return rollno;
	 }
	 
	public void setRollno(int rollno){
	  this.rollno = rollno;
	}
	 public String getName(){
	  return name;
	}
	 
	public void setName(String name){
	  this.name = name;
	}
	public Double getTotalmarks(){
	   return totalmarks;
	}
	  
	public void setTotalmarks(Double totalmarks){
	   this.totalmarks = totalmarks;
	}

}