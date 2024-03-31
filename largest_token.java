//largest and smallest token .
// import java.util.*;
// public class largest_token {
//     public static void main(String[] args) {
//        StringTokenizer s1=new StringTokenizer("hemmlooo frandsss i am akshita", " ", false);

//     }
// }
import java.util.StringTokenizer;

public class largest_token {
    public static void main(String[] args) {
        String input = "This is a test stringgg my name is akshitaaaaa  ";
        String delimiter = " ";
        
        // Tokenize the input string using the given delimiter
        StringTokenizer tokenizer = new StringTokenizer(input, delimiter);
        
        String largestToken = "";
        String smallestToken = "";
        
        // Find the largest and smallest tokens
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            
            if (largestToken.length() == 0 || token.length() > largestToken.length()) {
                largestToken = token;
            }
            
            if (smallestToken.length() == 0 || token.length() < smallestToken.length()) {
                smallestToken = token;
            }
        }
        
        System.out.println("Input: " + input);
        System.out.println("Largest Token: " + largestToken);
        System.out.println("Smallest Token: " + smallestToken);
    }
}
