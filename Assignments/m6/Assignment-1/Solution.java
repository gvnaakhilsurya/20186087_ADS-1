import java.util.Scanner;
import java.util.*;
class AddLargeNumbers {
    /**.
     * { function_description }
     *
     * @param      number  The number
     *
     * @return     { description_of_the_return_value }
     */
    
    public static LinkedList numberToDigits(String number) {
        /**.
         * { var_description }
         */
        LinkedList ll = new LinkedList();
         String[] digits=number.split("");
        for (int i = 0; i<digits.length; i++) {
            ll.add(digits[i]);
            }

        return ll;
    }
    public static String digitsToNumber(LinkedList list) {
        /**.
         * { var_description }
         */
        String str="";
        for(int i=0; i < list.size(); i++){
            str+=list.get(i);
        }
        return str;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        /**
         * { item_description }
         */
        
    return null;
    }
}

public class Solution {
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
