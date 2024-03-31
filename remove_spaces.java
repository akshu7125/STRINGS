import java.util.*;

public class remove_spaces {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String s2= s.replaceAll("\\s","");
        System.out.println(s2);
    }
}
