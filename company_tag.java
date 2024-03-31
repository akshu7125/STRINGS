 import java.util.*;
// // public class company_tag {
// //      static public void pair(String s ){
// //         char[] arr=s.toCharArray();
// //         String ans="";

// //         for (int i = 0; i < arr.length; i+=2) {
// //             if(arr[i]>arr[i+1]){
// //                 ans+=arr[i];
// //             }
// //         }
// //     }
// // }
// import java.util.*;

// //import javax.sound.sampled.SourceDataLine;
// public class company_tag {

//    public static void main(String[] args){
//     String str1=new String("ELECTRONICS");
//     str1=str1.toLowerCase();
//     //System.out.println(str1);
//     char[] a=str1.toCharArray();
//     char[] b={};
//     int n=a.length;
//     if(n%2!=0){
//         n=n-1;
//     }
//     int j=0;
//     int i;
//     for(i=0;i<=n-1;i=i+2){
//         if(a[i]>a[i+1]){
//             b[j]=a[i];
//             j++;
//         }
//         else{
//             b[j]=a[i+1];
//             j++;
//         }

//     }
//     if(a.length%2 !=0){
//         b[j+1]=a[i+1];
//     }
//     for(int k=0;k<j;k++){
//         System.out.println(a[k]);
//     }}}import java.util.ArrayList;

public class company_tag{
   /*public static void main(String[] args) {
       String str1 = new String("ELECTRONICS");
       str1 = str1.toLowerCase();
       char[] a = str1.toCharArray();
       ArrayList<Character> b = new ArrayList<Character>();
       int n = a.length;
       if (n % 2 != 0) {
          n = n - 1;
       }
       int i=0;
       int j = 0;
       for ( i = 0; i <= n - 1; i = i + 2) {
          if (a[i] > a[i + 1]) {
             b.add(a[i]);
             j++;
          } else {
             b.add(a[i + 1]);
             j++;
          }
       }
       if (a.length % 2 != 0) {
          b.add(a[i]);
       }
       for (int k = 0; k < j; k++) {
          System.out.println(b.get(k));
       }
    }
}*/
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String input=sc.nextLine();
   ArrayList<Character> list=new ArrayList<>();
   char[] arr=input.toCharArray();
   int n=arr.length;
   if(n%2!=0){
      n=n-1;
   }
   int j=0;
   for (int i = 0; i < arr.length-1; i+=2) {
      if(arr[i]>arr[i+1]){
         list.add(arr[i]);
         j++;
      }
      else{
         list.add(arr[i+1]);
         j++;
      }
   }
   if(arr.length % 2!=0){
      list.add(arr[n-1]);
   }
   for (int i = 0; i < j; i++) {
      System.out.print(list.get(i));
   }
}
}