import java.util.Scanner;
import java.util.Arrays;
class Solution{
Solution(){

}
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
int inputs = sc.nextInt();
int[]numarry = new int[inputs];
for (int i = 0 ;i<inputs;i++) {
	numarry[i] = sc.nextInt();
}
Arrays.sort(numarry);
int count = 0;
for (int i = 0;i < inputs;i++) {
	for (int j = i+1 ;j < inputs ;j++) {
		int k = Arrays.binarySearch(numarry, -(numarry[i] + numarry[j]));
		if(k > j) {
			count++;
		}
	}	
}
 System.out.println(count);

}
}


// public static boolean search(final int low, final int high,
//     final int[] b, final int s) {

// int midnum = 0;
// int count = 0;
// int lownum = low;
// int highnum = high;
// while(lownum <=highnum){
// 	midnum = (lownum + highnum)/2;
// 	if (search == numarry[midnum]) {
// 		return true;
// 	} else if(numarry[midnum]>search){
// 		highnum = midnum -1;	
// 	} else{
// 		lownum = midnum + 1;
// 	}

// 	}
// 	return false;

// }
// }

