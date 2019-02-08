import java.util.*;
class Student implements Comparable<Student>{
	private int rno;
	private String sname;
	private int marks;
	private int nstuds;
	private int size;
	Student[]sarray;
	Student[]list;
	Student[]result;

	// ArrayList<Student>list = new ArrayList<Student>();
	// ArrayList<Student>result = new ArrayList<Student>();

	public Student(int rno,String sname,int marks){
		
		this.rno = rno;
		this.sname = sname;
		this.marks = marks;
	}
	public Student(int nstuds){
		sarray = new Student[nstuds];
		list = new Student[nstuds];
		result = new Student[nstuds];
	}
	 public int getMarks(){
	  return marks;
	 }
	 
	 public void setMarks(int marks){
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

	public void getResult(int query){
		InsertionSort.sort(sarray);
		// System.out.println(Arrays.toString(sarray));
		for (int i = 0;i <size;i++) {
			if (sarray[i].getMarks()==query) {
				System.out.println(sarray[i]);
			}
			
		}

		

	}
	public int compareTo(Student that){
		Student a = this;
		if(a.rno>that.rno) return -1;
		if(a.rno<that.rno) return 1;
		if (Integer.valueOf(a.sname) > Integer.valueOf(that.sname)) return -1;
		if (Integer.valueOf(a.sname) < Integer.valueOf(that.sname)) return 1;
		if(a.marks > that.marks) return -1;
		if(a.marks < that.marks) return 1;
		return 0;
		

	}
	public String toString(){
		return this.rno+","+this.sname+","+(double)this.marks;
	}




}