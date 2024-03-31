import java.util.*;
public class capitalfirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String arr[]=s.split("\\s");
        StringBuilder sb=new StringBuilder();
        for(String w:arr){
            sb.append(Character.toUpperCase(w.charAt(0))+w.substring(1)+" ");
        }
        System.out.println(sb);
    }
}
