import java.util.*;
class Solution{
	public static double Percent(int n,ArrayList<Double>temp,double target){
		double count = 0;
		double res =0;
		double res1 =0;
		// System.out.println(temp);
		for (int i = 0;i < temp.size();i++) {
			if (target >= temp.get(i)){
				count = count + 1;
			}
		}
		res  = 100 * count/n;
		res1 = Math.round(res * 100D) / 100D;
		// System.out.println(res1);
		return res1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> temp = new ArrayList<Double>();
		ArrayList<Double> list = new ArrayList<Double>();
		Hashtable<Double,Candidate> ht = new Hashtable<Double,Candidate>();
		int nips = Integer.parseInt(sc.nextLine());
		for (int i = 0;i < nips ;i++) {
			String[]tokens = sc.nextLine().split(",");
			// System.out.println(Arrays.toString(tokens));
			for (int j = 0;j < tokens.length;j++) {
				list.add(Double.parseDouble(tokens[j]));
			}
			temp.add(Double.parseDouble(tokens[1]));
		}
		for (int k = 0;k < list.size(); k+=2) {
			ht.put(list.get(k),new Candidate(list.get(k),Percent(nips,temp,list.get(k+1))));
		}
		int query = Integer.parseInt(sc.nextLine());
		double result = 0; 
		for (int i = 0;i < query;i++) {
			result =ht.get(Double.parseDouble(sc.nextLine())).getPercentil();
			System.out.println(result);
			
		}

	}
}