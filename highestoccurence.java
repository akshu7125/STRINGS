import java.util.*;
public class highestoccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] arr=s.toCharArray();
        int count =0;
        int max=0;
        char maxchar='\0';
        for(int i=0;i<arr.length;i++){
             count =1;
            for(int j=i+1;j<arr.length;j++){
                count++;
               if(count>max){
                max=count;
                maxchar=arr[i];
               }    
            }
        }
    }
}
