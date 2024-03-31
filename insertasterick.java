import java.util.*;
public class insertasterick {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder sb=new StringBuilder(input);
        String indices=sc.nextLine();
        String[] arr=indices.split(" ");
        for (int i = 0; i < arr.length; i++) {
            sb.insert(Integer.parseInt(arr[i]),"*");
        }
        System.out.println(sb);
    }
}
