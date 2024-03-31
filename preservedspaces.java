import java.util.*;
public class preservedspaces{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        char[] arr=input.toCharArray();
        char[] ans=new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==' '){
                ans[i]=' ';
            }
        }
        int j=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=' '){
                if(ans[j]==' '){
                    j--;
                }
                ans[j]=arr[i];
                j--;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]);
        }
    }
}