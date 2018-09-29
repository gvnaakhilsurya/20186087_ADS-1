import java.util.Scanner;
import java.util.*;
class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
        LinkedList ll = new LinkedList();
         String[] digits=number.split("");
        for (int i = 0; i<digits.length; i++) {
            /*System.out.println(number.charAt(i));*/
            ll.add(digits[i]);
            
            /*System.out.print(Arrays.toString(ll));*/
        }
        /*System.out.print(ll.displayAll());*/
        /*System.out.println(ll);*/

        return ll;
    }
    public static String digitsToNumber(LinkedList list) {
        String str="";

        for(int i=0; i < list.size(); i++){
            str+=list.get(i);
        }
        return str;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
        
    return null;
    }
}

public class Solution {
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
