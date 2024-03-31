import java.util.*;

public class reverseonlyletter {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char arr[]=s.toCharArray();
    StringBuilder str=new StringBuilder(s);
    int i=0;int j=s.length()-1;
    char c=0,d=0;
    while(i<=j){
        c=s.charAt(i);
        d=s.charAt(j);
        if((c>='a'&& c<='z')||(c>='A'&&c<='Z')){
            if((d>='a'&& d<='z')||(d>='A'&& d<='Z')){
                str.setCharAt(i,d);
                str.setCharAt(j, c);
                j--;
                i++;
            }
            else j--;
        }
        else i++;
    }
    System.out.println(str);
 }   
}
