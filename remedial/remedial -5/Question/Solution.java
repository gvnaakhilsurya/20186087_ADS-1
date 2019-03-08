import java.util.*;
class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		MaxPQ<Candidate> max = new MaxPQ<Candidate>();
		Candidate cn = new Candidate();
		while(sc.hasNext()){
			String[] tokens = sc.nextLine().split(" ");	
			if (tokens[0].equals("Apply")) {
				String tokens1[] = tokens[1].split(",");
				// System.out.println(Arrays.toString(tokens1));
				Candidate cn1 = new Candidate(Integer.parseInt(tokens1[0]),tokens1[1],tokens1[2],Double.parseDouble(tokens1[3]));
				// System.out.println(cn1);
				// max.insert(new Candidate(Integer.parseInt(tokens1[0]),tokens1[1],tokens1[2],Double.parseDouble(tokens1[3])));
				max.insert(cn1);
			}else if(tokens[0].equals("Recruit_Top_Candidate")){
				System.out.println(max.delMax());
			}else if (tokens[0].equals("Ranking")){
				System.out.println();
				int i = 1;
				while(max.size()!=0)
				System.out.println(i++ +":"+" "+max.delMax());
				

			}

		}
		
	}
}