import java.util.*;
public class reveresecase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        String reversed= "";
        for(char c:arr){
            if(Character.isUpperCase(c)){
                reversed+=Character.toLowerCase(c);
            }
            else 
            reversed+=Character.toUpperCase(c);
        }
        System.out.println(reversed);
    }
}
