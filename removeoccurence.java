import java.util.*;
public class removeoccurence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        char x=sc.nextLine().charAt(0);
        char arr[]=input.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                continue;
            }
            else{
                System.out.print(arr[i]);
            }
        }

    }
}