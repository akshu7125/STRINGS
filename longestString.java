import java.util.*;
public class longestString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String arr[]=input.split(" " );
        int max=0;
        for(String words:arr){
            int length=words.length();
            if(length>max){
                max=length;
            }
        }
        System.out.println(max);
    }
}
