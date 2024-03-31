import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class secondlargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder sb=new StringBuilder("");
        String[] number=input.split(" ");
        int[] arr=new int[number.length];
        for (int i = 0; i < number.length; i++) {
          arr[i]=Integer.parseInt(number[i]);
        }
        Arrays.sort(arr);
        
    }
    System.out.print(arr[arr.length-2]);
}

 
