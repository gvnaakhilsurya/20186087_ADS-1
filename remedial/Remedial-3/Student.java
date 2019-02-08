import java.util.*;
class Student implements Comparable<Student>{
	private int rno;
	private String sname;
	private double marks;
	private int nstuds;
	private int size;
	Student[]sarray;
	public Student(int rno,String sname,double marks){
		this.rno = rno;
		this.sname = sname;
		this.marks = marks;
	}
	public Student(int nstuds){
		sarray = new Student[nstuds];
	}
	 public double getMarks(){
	  return marks;
	 }
	 
	 public void setMarks(double marks){
	  this.marks = marks;
	 }
	  public String getSname(){
	   return sname;
	  }
	  
	  public void setSname(String sname){
	   this.sname = sname;
	  }
	   public int getRno(){
	    return rno;
	   }
	   
	   public void setRno(int rno){
	    this.rno = rno;
	   }
	public void addStudent(Student student){
		for (int i = 0;i < sarray.length;i++) {
			if (sarray[i]==null) {
				sarray[i]= student;
				size++;
				break;
			}
		}
	}

	public int indexOf(double query){
		for (int i = 0;i < size;i++) {
			if (sarray[i].getMarks()==query) {
				return 1;
			}
		}
		return 0;

	}

	public void getResult(double query){
		InsertionSort.sort(sarray);
		if (indexOf(query) == 1) {
			for (int i = 0;i <size;i++) {
			if (sarray[i].getMarks()==query) {
				System.out.println(sarray[i]);
			}
		}
		}else{
			System.out.println("This marks are not awarded to any student");
		}

	}
	public int compareTo(Student that){
		Student a = this;
		// if(a.rno>=that.rno) return -1;
		// if (a.sname.compareTo(that.sname) > 0)  return -1;
		// if (a.sname.compareTo(that.sname) < 0) return 1;
		// if(a.rno<=that.rno) return 1;
		// if(a.marks > that.marks) return -1;
		// if(a.marks < that.marks) return 1;
		// return 0;
		if(a.rno>=that.rno){
			return 1;
		}

		if(a.marks >= that.marks){
			if (a.sname.compareTo(that.sname)<0) {
				return 1;
			}else{
				return -1;
			}
		}
		if(a.rno<=that.rno){
			return -1;
		} 
		return 0;
		
		
		
		

	}
	public String toString(){
		return this.rno+","+this.sname+","+ this.marks;
	}




}