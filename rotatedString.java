import java.util.Scanner;
public class rotatedString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        char[] inputchar=input.toCharArray();
        int k=sc.nextInt();
        for(int i=inputchar.length-k;i<inputchar.length;i++ ){
            System.out.print(inputchar[i]);
        }
        for(int i=0;i<inputchar.length-k;i++){
            System.out.print(inputchar[i]);
            
        }
    }
}
