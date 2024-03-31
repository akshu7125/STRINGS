import java.util.Scanner;
public class removespecialchar {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        str=str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);

    }
}
