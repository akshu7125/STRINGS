import java.util.Scanner;

public class wordwise {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String x= sc.nextLine();
       String[] words=x.split(" ");
       StringBuilder reversed= new StringBuilder();
       for(int i=words.length-1;i>=0;i--){
            reversed.append(words[i]+" ");
       }
       System.out.println(reversed.toString());

    }
}
