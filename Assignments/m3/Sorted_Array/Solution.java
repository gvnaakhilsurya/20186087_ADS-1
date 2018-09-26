import java.util.*;
public class Solution{
	public void mergeArrays(int[] a,int[] b){
		int i = 0;
		int j = 0;
		int k = 0;
		int[] c = new int[a.length+b.length];
		while(i<a.length && j<b.length){
			if (a[i]<b[j]) {
				c[k++]=a[i];
				i++;
			}else{
				c[k++] = b[j];
				j++;
			}

		}
		System.out.println(Arrays.toString(c));

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//reading the first line input
		int m = Integer.parseInt(sc.nextLine());
		// reading second line input
		int n = Integer.parseInt(sc.nextLine());
		int[]a = new int[m];
		int[]b = new int[n];
		String[] elements = sc.nextLine().split(",");
		for (int i = 0;i< elements.length;i++) {
			a[i] = Integer.parseInt(elements[i]);
		}
		elements = sc.nextLine().split(",");
		for (int i = 0;i< elements.length;i++) {
			b[i] = Integer.parseInt(elements[i]);
		}
		new Solution().mergeArrays(a,b);


	}
}