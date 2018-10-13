public class Frequencycount
{
 public static void main(String[] args)
 {
 int minlen = Integer.parseInt(args[0]); // key-length cutoff
 ST<String, Integer> st = new ST<String, Integer>();
 while (!StdIn.isEmpty())
 { // Build symbol table and count frequencies.
 String word = StdIn.readString();
 if (word.length() < minlen) continue; // Ignore short keys.
 if (!st.contains(word)) st.put(word, 1);
 else st.put(word, st.get(word) + 1);
 }
 // Find a key with the highest frequency count.
 String max = "";
 st.put(max, 0);
 for (String word : st.keys())
 if (st.get(word) > st.get(max))
 max = word;
 StdOut.println(max + " " + st.get(max));
 }
}

public static void main(String[] args)
{
 ST<String, Integer> st;
 st = new ST<String, Integer>();
 for (int i = 0; !StdIn.isEmpty(); i++)
 {
 String key = StdIn.readString();
 st.put(key, i);
 }
//  for (String s : st.keys())
//  StdOut.println(s + " " + st.get(s));
// }
