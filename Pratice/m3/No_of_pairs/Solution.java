import java.util.*;
public class Solution{
	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		int n = sc.nextInt();
 		int a[] = new int[n];
 		for (int i = 0;i<n;i++){
 			a[i]= sc.nextInt();
 		}
 		int cnt = 0;
 		int chk = 1;

 		Arrays.sort(a);
 		// System.out.println(Arrays.toString(a));
 		for (int i = 0;i< a.length-1;i++) {
 			if (a[i]==a[i+1]) {
 				chk +=1;
 			}else{
 				cnt += (chk*(chk-1))/2;
 				System.out.println(a[i] + " :: " + cnt);
 				chk = 1;
 			}
	   }
	   cnt += (chk*(chk-1))/2;

	    System.out.println(cnt);


	}


}   


