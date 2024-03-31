import java.util.StringTokenizer;
public class countwordsinstring {
    public static void main(String[] args) {
        StringTokenizer s1=new StringTokenizer("hello frands i am the best"," ");
        System.out.println(s1.countTokens());
    }
}
