import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String tokens = sc.nextLine();
            String[] lines = tokens.split(",");
            MergeSort.sort(lines);
            System.out.println(MergeSort.show(lines));
            System.out.println();

        }
    }
}