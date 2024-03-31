import java.util.Scanner;
public class reverseEachWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] words=input.split(" ");
        String reversed="";
        for(int i=0;i<words.length;i++){
            StringBuilder t=new StringBuilder(words[i]);
            reversed+=t.reverse()+" ";
        }
        reversed.trim();
        System.out.println(reversed.toString());

    }
}
