public class InsertionSort {
	/**.
	 * This method is used for the sorting.
	 *
	 * @param      a     it is an array of the comparable type. 
	 */
	public static void sort(Comparable[] a) {
		int arr_length = a.length;
		for (int i = 0; i < arr_length; i++) {
			for (int j = i; j > 0; j--) {
				if (less(a[j - 1], a[j])) {
					exch(a, j, j - 1);
				}
				else {
					break;
				}
			}
		}
	}

	/** By analaysis the complexity of the above method is O(N^2).
	/**.
	 *It is an method   for to compare the two objects of the
	 *comparable type.  
	 *
	 * @param      v  comparable type
	 *    
	 * @param      w  comparable type
	 *
	 * @return     boolean
	 */
	private static boolean less(Comparable v, Comparable w) {
		/**.
		 * It compares the two values of the comparable 
		 * type retumns the boolean type.
		 * 
		 */
		return (v.compareTo(w) < 0);
		/**By analaysis the complexity of the above method is O(1).**/
	}

	/**By analaysis the complexity of the above method is O(1).
	/**.
	 * This method is used for the exchaning the values in an 
	 * comparable array as per the value of the less method returns.
	 *
	 * @param      a      Comparable array
	 * @param      i     index value of integer type
	 * @param      j     index value of integer type
	 */

	private static void exch(Comparable[] a, int i, int j) {
		/**.
		 * It swaps the elements as per the index values given		 */
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	/**By analaysis the complexity of the above method is O(1).**/
}
