import java.util.*;
class AddLargeNumbers {
    
    public static LinkedList numberToDigits(String number) {
    	String str = number;
    	String[]tokens = str.split("");
    	LinkedList<Integer> l1 = new LinkedList();
    	for (int i = 0;i < tokens.length;i++) {
    		l1.add(Integer.parseInt(tokens[i]));
    	}
    	return l1;

    }

    public static String digitsToNumber(LinkedList list) {
    	LinkedList list1 = list;
    	String str1 = "";
    	for (int i = 0;i < list1.size();i++ ) {
    		str1 = str1 + list1.get(i);
    	}
    	return str1;
    }

    public static LinkedList addLargeNumbers(LinkedList<Integer> list1, LinkedList<Integer> list2) {
    	LinkedList<Integer> temp = new LinkedList<Integer>();
    	LinkedList<Integer> result = new LinkedList<Integer>();
    	Stack<Integer> stack1 = new Stack<Integer>();
    	Stack<Integer> stack2 = new Stack<Integer>();
    	int carry = 0;
    	for (int i = 0;i <list1.size() ;i++ ) {
    		stack1.push(list1.get(i));
    	}
    	for (int j = 0;j < list2.size();j++ ) {
    		stack2.push(list2.get(j));
    	}
    	int len = stack1.size() > stack2.size() ? stack1.size() : stack2.size();
    	for (int k = 0;k < len;k++) {
    		 int d1 = 0, d2 = 0;
            try {
                d1 = stack1.pop();
            } 
            catch(Exception e){}            
            try {
                d2 = stack2.pop();
            } 
            catch(Exception e){}                        
            int x = d1 + d2 + carry;
            temp.add(x % 10);
            carry = x / 10;
        }
        /* Adding carry */
        while (carry != 0)
        {
            temp.add(carry % 10);
            carry /= 10;
        }
        for (int l = temp.size()-1;l >=0;l--) {
        	result.add(temp.get(l));
        }
    	return result;

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
                LinkedList ppDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qqDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(ppDigits, qqDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
