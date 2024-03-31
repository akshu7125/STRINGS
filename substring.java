import java.util.*;
public class substring {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
       String st =  sc.next();
       String st2 =  sc.next();

       for(int  i =0 ; i<st.length(); i++){
      String res = st.substring(i,st2.length()-1);
      
       if(res.equals(st)){
        System.out.println("substring is present");
       }
       else{
        System.out.println("not present");
       }
       }
      
       

    }
    
}
