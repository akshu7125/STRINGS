// import java.util.*;
// public class cyclic_sum {
//     public static void main(String[] args) {
//         Scanner scan=new Scanner(System.in);
//         String number="58219";
//         int sum=0;
//         int totalSum=0;
//         for (int i = 0; i < number.length(); i++) {
//           sum+=number.charAt(i);
//           System.out.println("sum"+sum);
//           totalSum+=sum;
//           System.out.println("totalSum"+totalSum);
          

//         }
//         System.out.println(totalSum);

        
//     }
// }
public class cyclic_sum {

    public static void main(String[] args) {
        String input = "58219";
        int sum = 0;
       // int length = input.length();

        for (int i = 0; i < input.length(); i++) {
            
            for (int j = 0; j <= i; j++) {
                sum += (input.charAt(j));
            }
            //sum += cycleSum * (length - i);
        }
       

        System.out.println("Sum of digits in cyclic order: " + sum);
    }
}

