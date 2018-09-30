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
		boolean result;
		int count = 0;
		for (int i = 0;i < inputs;i++) {
			for (int j = i;j < inputs ;j++) {
				int low = j+1;
				int high = inputs-1;
				result = search(low,high,numarry, -(numarry[i] + numarry[j]));
				if (result) {
					count++;
						
				}	
			}	
		}
		 System.out.println(count);
    
	}


	public static boolean search(final int low, final int high,
        final int[] b, final int s) {

		int midnum = 0;
		int count = 0;
		int lownum = low;
		int highnum = high;
		int[]numarry = b;
		int search = s;
		while(lownum <=highnum){
			midnum = (lownum + highnum)/2;
			if (search ==numarry[midnum]) {
				return true;
			} else if(numarry[midnum]>search){
				highnum = midnum -1;	
			} else{
				lownum = midnum +1;
			}

			}
			return false;

		}
	}





