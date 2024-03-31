// import java.util.*;
// public class removeduplicate {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.nextLine();
//         StringBuilder sb=new StringBuilder(); 
//         char arr[]=s.toCharArray();
//         for(int i=0;i<arr.length;i++){
//             char current=arr[i];
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]==current){
//                     arr[j]='\0';

//                 }
//             }
//         }
//         for(char c:arr){
//             if(c!='\0')
//             sb.append(c);
//         }
//         System.out.print(sb);
//         }
//    
import java.util.*;

//import recursion.factorial;
public class removeduplicate{
    /*public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
       
        char arr[]=input.toCharArray();
        for(int i=0;i<arr.length;i++){
           // System.out.println(arr[i]);
           for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                arr[j]='\0';

            }
           }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] !='\0'){
                System.out.print(arr[i]);
            }
        }

    }*/
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    char[] arr=input.toCharArray();
    /*HashMap<Character,Integer> ans=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        if(ans.containsKey(arr[i])){
            ans.put(arr[i],ans.get(arr[i]+1));
        }
        else{
            ans.put(arr[i],1);
        }

    }
    for(Map.Entry<Character,Integer>e:ans.entrySet()){
        System.out.println(e.getKey());
    }
*/
HashMap<Character,Integer> ans=new HashMap<>();
for(int i=0;i<arr.length;i++){
    if(ans.containsKey(arr[i])){
        ans.put(arr[i],ans.get(arr[i])+1);
    }
    else{
        ans.put(arr[i],1);
    }
}
for(Map.Entry<Character,Integer>e:ans.entrySet()){
    System.out.print(e.getKey());
        System.out.print(e.getValue());

}

    }
}