import java.util.Scanner;
public class sumofallchar {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String input = sc.nextLine(); 
            int sum = 0;
            for (char c : input.toCharArray()) {
                sum += (int) c;
            }
    
            System.out.println( sum);
        }
    }
    

