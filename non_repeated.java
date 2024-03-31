import java.util.*;
public class non_repeated {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in); 
        String s=scan.nextLine();
        
        for (int i = 0; i < s.length(); i++) {
            boolean unique=true;
            for (int j = 0; j < s.length(); j++) {
                if(i!=j && s.charAt(i) == s.charAt(j)){
                    unique=false;
                   break;
                }
                
            }
            if(unique){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
/*
 * string s="";
 * for(int i=0;i<s.length();i++){
 * for(int j=0;j<s.length();j++){
 *  if(i!=j&&s.charAt(i)==charAt(j))
 * unique=false;
 * break;
 * }}
 * if(unique){
 * Sout(s.charAt(i));
 * break;}
 */
