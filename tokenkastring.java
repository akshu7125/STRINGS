import java.util.StringTokenizer;
public class tokenkastring {
    public static void main(String[] args) {
        StringTokenizer s1=new StringTokenizer("hello,siya,how,are,you", ",", true);
        StringBuilder s2=new StringBuilder();
        while(s1.hasMoreTokens()){
            s2.append(s1.nextToken());
        }
        String output = s2.toString();
        
        System.out.println("Output: " + output);
    }
    }

