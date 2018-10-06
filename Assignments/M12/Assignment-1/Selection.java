/**
 * Class for selection.
 * This class is for the Selection sort algoritham.
 */

class Selection{
	/**.
	 * 
	 *
	 * @param      a     Comparable type array.
	 */
	public static void sort(Comparable[]a){
		/**By analaysis the complexity of the above method is O(N^2).**/
		
		/**
		 * This method is for sorting the array of elements of the which is
		 * of the Comparable type.
		 */
		int n = a.length;
		for (int i = 0;i<n;i++) {
			int min = i;
			for (int j = i+1;j<n;j++) {
				if (less(a[j],a[min])){
					min = j;
				}
			}
		exch(a, i, min);	
		}
		
	}
	/**.
	 *This method is for comparing the two comparable type
	 *elements and checks the differences b/w two elements
	 which are places in the correct place on the sorted order.
	 *
	 * @param      v    comparable type 
	 * @param      w   comparable type  
	 *
	 * @return    boolean type
	 */

	private static boolean less(Comparable v, Comparable w){
		/**By analaysis the complexity of the above method is O(1).**/
		/**
		 * It compares the two values of the comparable 
		 * type retumns the boolean type.
		 */
		return v.compareTo(w)<0;
		
	}

	/**.
	 *
	 *
	 * @param      a     Comparable array
	 * @param      i    index value of integer type 
	 * @param      j    index value of integer type 
	 */
	private static void exch(Comparable[] a,int i,int j){
		/**
		 ** It swaps the elements as per the index values given*/
		Comparable t = a[i];
		a[i] = a[j];
		a[j]= t;
	}
	/**By analaysis the complexity of the above method is O(1).**/

}