import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key = sc.nextLine();
		int n = Integer.parseInt(sc.nextLine());
		switch (key) {
			case "String":
			while(n > 0) {
				String[] tokens = sc.nextLine().split(",");
				MinHeap min = new MinHeap(tokens);
				System.out.println(min.IsMinHeap());
				n--;
			}
			break;

			case "Integer":
			while(n > 0) {
			String[] tokens = sc.nextLine().split(",");
			Integer[] inttokens = new Integer[tokens.length];
			for (int i = 0; i < tokens.length; i++) {
				inttokens[i] = Integer.parseInt(tokens[i]);
			}
			MinHeap min = new MinHeap(inttokens);
			System.out.println(min.IsMinHeap());
			n--;
		}
			break;

			case "Float":
			while(n > 0) {
			String[] tokens = sc.nextLine().split(",");
			Float[] floattokens = new Float[tokens.length];
			for (int i = 0; i < tokens.length; i++) {
				floattokens[i] = Float.parseFloat(tokens[i]);
			}
			
			MinHeap min = new MinHeap(floattokens);
			System.out.println(min.IsMinHeap());
			n--;
		}
		break;

		case "Double":
			while(n > 0) {
			String[] tokens = sc.nextLine().split(",");
			Double[] doubletokens = new Double[tokens.length];
			for (int i = 0; i < tokens.length; i++) {
				doubletokens[i] = Double.parseDouble(tokens[i]);
			}
			MinHeap min = new MinHeap(doubletokens);
			System.out.println(min.IsMinHeap());
			n--;
		}
		break;
		default:
		break;

}	}

    


	


    
}
		
	
