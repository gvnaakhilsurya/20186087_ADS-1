//import java.lang.Comparable;
class Selection{
	/**.
	 * 
	 *
	 * @param      a     Comparable type array.
	 */
	public static void sort(Comparable[]a){
		/**
		 * 
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
		/**By analaysis the complexity of the above method is O(N^2Log(N)).**/
		
	}
	/**.
	 * 
	 *
	 * @param      v    comparable type 
	 * @param      w   comparable type  
	 *
	 * @return    boolean type
	 */

	private static boolean less(Comparable v, Comparable w){
		/**
		 * It compares the two values of the comparable 
		 * type retumns the boolean type.
		 */
		return v.compareTo(w)<0;
		/**By analaysis the complexity of the above method is O(1).**/
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