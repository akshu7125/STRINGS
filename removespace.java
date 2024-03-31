import java.util.*;
public class removespace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder n=new StringBuilder(s);
       System.out.println(s.replaceAll(" ", ""));
    }
}
