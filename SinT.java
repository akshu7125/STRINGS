import java.util.Scanner;
public class SinT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String T=sc.nextLine();
        String S=sc.nextLine();
        StringBuilder t=new StringBuilder(T);
        if(T.contains(S)){
            System.out.println(T.indexOf(S));
        }
        else{
            System.out.println("-1");
        }


    


    }
}
