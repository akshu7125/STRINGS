import java.util.Scanner;
public class firstnonrepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        char[] arr=input.toCharArray();
       
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    
                    arr[j]='\0';
                }
                
            }
           
        }
      
 
    }
}
