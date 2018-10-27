/**
 * Class for student.
 */
class Student {
	/**
	 * { var_description }
	 */
	private int rollno;
	private String name;
	private double totalmarks;
	/**
	 * Constructs the object.
	 *
	 * @param      rollno      The rollno
	 * @param      name        The name
	 * @param      totalmarks  The totalmarks
	 */
	Student(final int rollno, final String name, final double totalmarks) {
		this.rollno = rollno;
		this.name = name;
		this.totalmarks = totalmarks;
	}
	/**
	 * Constructs the object.
	 *
	 * @param      name        The name
	 * @param      totalmarks  The totalmarks
	 */
	Student(final String name, final double totalmarks) {
		this.name = name;
		this.totalmarks = totalmarks;
	}
	/**
	 * Gets the rollno.
	 *
	 * @return     The rollno.
	 */
	 public int getRollno() {
	  return rollno;
	 }
	 /**
	  * Sets the rollno.
	  *
	  * @param      rollno  The rollno
	  */
	public void setRollno(int rollno) {
	  this.rollno = rollno;
	}
	/**
	 * Gets the name.
	 *
	 * @return     The name.
	 */
	 public String getName() {
	  return name;
	}
	/**
	 * Sets the name.
	 *
	 * @param      name  The name
	 */
	public void setName(String name) {
	  this.name = name;
	}
	/**
	 * Gets the totalmarks.
	 *
	 * @return     The totalmarks.
	 */
	public Double getTotalmarks() {
	   return totalmarks;
	}
	/**
	 * Sets the totalmarks.
	 *
	 * @param      totalmarks  The totalmarks
	 */
	public void setTotalmarks(Double totalmarks) {
	   this.totalmarks = totalmarks;
	}

}