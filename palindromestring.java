import java.util.*;


public class palindromestring {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    //     String str = scan.nextLine();
    //     StringBuilder sb=new StringBuilder(str);
    //     StringBuilder rev=new StringBuilder();
    //     rev=sb.reverse();
    //    System.out.println(rev);
    //    if(sb.equals(rev)){
    //     System.out.println("palindrome string");
    //    }
    //    else{
    //     System.out.println("not a palindrome string");
    //    }
    String s=sc.nextLine();
            char[] arr=s.toCharArray();
            int i=0,j=arr.length-1;
            int flag=0;
            while(i<j){
                 if(arr[i++] !=arr[j--]){
                    flag=1;
                    break;
                    
                 }
            }
            if(flag==1){
                System.out.println("not palindrome");
            }
            else{
                System.out.println("palindrome");
            }
   
    }
}

/*
 String s=sc.next();
    char arr[]=s.toCharArray();
    int i=0;int j=arr.length-1;
    int temp=0;
    while(i<j){
       if(arr[i++]!=arr[j--])
       temp=1;
    }
    if(temp==1){
       System.out.print("not palindrome");  
    }
    else
    System.out.print("palindrome");
 */
