import java.util.*;
public class removeEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder sb=new StringBuilder("");
        String[] number=input.split(" ");
        for (int i = 0; i < number.length; i++) {
            int n=Integer.parseInt(number[i]);
            if(n%2!=0){
                sb.append(n).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
