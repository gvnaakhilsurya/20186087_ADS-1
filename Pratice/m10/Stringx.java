import java.util.Scanner;
/**
 * Class for stringx.
 */
class Stringx {
    /**
     * Adds a string.
     *
     * @param      s     input String
     *
     * @return     a String which replaces the star when the two alplabets are
     * same. 
     */
    public String addString(String s) {

        if (s.length() == 1) {
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
            return s.charAt(0) + "*" +addString(s.substring(1));
        }
        return s.charAt(0) + addString(s.substring(1));

    }
    public static void main(String[] args) {
        /**
         * It is the main function which takes input from the
         * user and 
         */
        Scanner scan = new Scanner(System.in);
        String s =  scan.nextLine();
        Stringx strx = new Stringx();
        System.out.println(strx.addString(s));

    }
}