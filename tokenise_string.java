import java.util.StringTokenizer;
public class tokenise_string {
    public static void main(String[] args) {
        StringTokenizer s1=new StringTokenizer("hello,fr,a,nds",",", true);
        while(s1.hasMoreTokens()){
        System.out.println(s1.nextToken());
    }
    }
}
