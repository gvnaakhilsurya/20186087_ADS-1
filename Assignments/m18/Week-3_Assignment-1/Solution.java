import java.util.Scanner;
class Solution {
    private Solution() {

    }
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTB bstb = new BSTB();
        BSTW bstw = new BSTW();
        int stcksperhr = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        while (sc.hasNext()) {
            sb.append(sc.nextLine() + "::");
        }
        String[] lines = sb.toString().split("::");
        int i = 0;
        Stock[] stocks = new Stock[lines.length];
        for (String line : lines) {
            String[]tokens = line.split(",");
            Stock stock = new Stock((tokens[0]), Float.parseFloat(tokens[1]));
            bstb.put(tokens[0], Float.parseFloat(tokens[1]));
            bstw.put(tokens[0], Float.parseFloat(tokens[1]));
        }
        
}


}

        