import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        String s2=scan.nextLine();
        if(s1.length()!=s2.length()){
            System.out.println("not anagram");
        }
        else {
            char[] arr1=s1.toCharArray();
            char[] arr2=s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                System.out.println("anagram");
            }
            else
            System.out.println("not anagram");
        }

        
    }
}
