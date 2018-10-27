import java.util.Scanner;
class Solution {
    private Solution() {

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearProbingHashST<String, Integer> lpst = new LinearProbingHashST<String, Integer>();
        int nopes = sc.nextInt();
        System.out.println(nopes);
        for (int i = 0; i < nopes; i++) {
            String line = sc.nextLine();
            String[]tokens = line.split(" ");
            switch (tokens[0]) {
                case "put":
                    lpst.put(tokens[1],Integer.parseInt(tokens[2]));
                    break;
                case "get":
                    System.out.println(lpst.get(tokens[1]));
                break;
                case "delete":
                    lpst.delete(tokens[1]);
                    break;
                
                case "display":
                    try {
                        lpst.display();
                    } catch (Exception e) {
                        System.out.println("{}");
                    }
                break;
                default:
                break;
            }

        }

    }

}


                
