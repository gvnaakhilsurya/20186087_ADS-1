import java.util.*;
import java.util.concurrent.TimeUnit;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long lStartTime = System.nanoTime();
		int n = Integer.parseInt(sc.nextLine());
		// System.out.println(n);
		//UF obj = new UF(n);
		// QuickUnionUF obj = new QuickUnionUF(n);
		// WeightedQuickUnionUF obj = new WeightedQuickUnionUF(n);
		QuickUnionPathCompressionUF obj = new QuickUnionPathCompressionUF(n);
		while(sc.hasNext()){
			String[] s =sc.nextLine().split(" ");
			if(obj.connected(Integer.parseInt(s[0]), Integer.parseInt(s[1]))){
				System.out.println("already connected");
			} else {
				obj.union(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
				System.out.println("conections established");
			}

		}
		long lEndTime = System.nanoTime();

		//time elapsed
        long output = lEndTime - lStartTime;

        System.out.println("Elapsed time in milliseconds: " + output / 1000000);
	}
}