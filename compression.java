import java.util.*;
public class compression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=1;
        String compressed="";
        ArrayList ls=new ArrayList();
        if(s.length()==0) System.out.println(" ");
        for (int i = 0; i < s.length(); i=i+count) {
            count=1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;  
                }
                else break;
            }
            ls.add(s.charAt(i));
            ls.add(count);
            
        }
        System.out.println(ls.size());
        Object arr[]=ls.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
       
    }
}
