import java.util.*;
public class navya {   
    public static void main(String args[]) {

// Valid Anagram


//        Scanner sc=new Scanner(System.in);
//        String s1 = sc.nextLine();
//        String s2 = sc.nextLine();
//        int temp=0;
//
//        char []arr1 = s1.toCharArray();
//        char []arr2 = s2.toCharArray();
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        for(int i=0;i<s1.length();i++){
//            if(arr1[i]!=arr2[i]){
//                temp=1;
//            }
//        }
//
//        if(temp==0){
//            System.out.println("valid");
//        }
//        else{
//            System.out.println("not valid");
//        }






// to Upper and to Lower


//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        char []arr = s1.toCharArray();
//        char c=0;
//        StringBuilder newStr = new StringBuilder(s1);
//
//        for(int i=0;i<s1.length();i++){
//            c=s1.charAt(i);
//            if(c>='a' && c<='z'){
//                c= Character.toUpperCase(c);
//                newStr.setCharAt(i,c);
//            }
//            else{
//                c=Character.toLowerCase(c);
//                newStr.setCharAt(i,c);
//            }
//        }
//
//        System.out.println(newStr);







//Palindrome


//        int temp=0;
//
//        char []arr=s.toCharArray();
//        int i=0;
//        int j=s.length()-1;
//        while(i<j){
//            if(arr[i++]!=arr[j--]) {
//                temp = 1;
//            } 
//        }
//
//        if(temp==0){
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("not palindrome");
//        }







// Reverse only letter


//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        char []arr=s1.toCharArray();
//        StringBuilder str = new StringBuilder(s1);
//
//        int i=0,j=s1.length()-1;
//        char c=0,d=0;
//
//        while(i<=j){
//            c=s1.charAt(i);
//            d=s1.charAt(j);
//            if( (c>='a' && c<='z') || (c>='A' && c<='Z') ){
//                if( (d>='a' && d<='z') || (d>='A' && d<='Z') ){
//                    str.setCharAt(i,d);
//                    str.setCharAt(j,c);
//                    i++;
//                    j--;
//                }
//                else{
//                    j--;
//                }
//            }
//            else{
//                i++;
//            }
//        }
//        System.out.println(str);








// Return number of occurrences of a word in the string

//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        String letter=sc.nextLine();
//        String arr[]=s1.split(" ");
//        int count=0;
//
//        for(int i=0;i<arr.length;i++){
//            if(letter.equals(arr[i])){
//                count++;
//            }
//        }
//        System.out.println(count);






// Print space before every capital letter


//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.nextLine();
//        char []arr=s1.toCharArray();
//
//        for(int i=0;i<s1.length();i++){
//            char c=s1.charAt(i);
//            if(c>='A' && c<='Z'){
//                if(i!=0){
//                    System.out.print(" ");
//                }
//            }
//            System.out.print(c);
//        }









//Round off to nearest multiple of 10

// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int ch = n%10;
// if(ch==0){
//     System.out.print(n);
// }
// else{
//     if(ch>=5){
//       System.out.print(((n/10)*10)+10);
//     }
//     else{
//         System.out.print((n/10)*10);
//     }
// }






// Reverse and leading and trailing spaces in between

// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// int i = s.length()-1;
// String ans = "";

// while(i>=0){
//     while(i>=0 && s.charAt(i)==' '){
//         i--;
//     }
//     String word = "";
//     while(i>=0 && s.charAt(i)!=' '){
//         word+=s.charAt(i);
//         i--;
//     }
//     ans+=word;

//     if(word.length()!=0){
//         ans+=" ";
//     }

// }

// System.out.print(ans.substring(0,ans.length()-1));








// First letter of each word along with their ASCII

// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// int count=0;
// int i=0;

// while(i<s.length()){
//     if(s.charAt(i)==' '){
//         count++;
//         i++;
//     }
//     else{
//         i++;
//     }
// }

// System.out.print(count+1+" ");

// char arr[] = s.toCharArray();
// System.out.print(arr[0]+""+(int)arr[0]+" ");

// for(int k=0;k<s.length();k++){
//   if(arr[k]==' '){
//       System.out.print(arr[k+1]+""+(int)arr[k+1]+" ");
//   }
// }








// Maximum occuring letter

// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// int ans=0;
// char w=0;

// String s2 = "";
// for(int i=0;i<s.length();i++){
//     if(s.charAt(i)==' '){
//         continue;
//     }
//     else{
//         s2+=s.charAt(i);
//     }
// }

// String st = s2.substring(0,s2.length()-1);
// for(int i=0;i<st.length()-1;i++){
//     char c = st.charAt(i);
//     int count=0;
//     for(int j=i;j<st.length();j++){
//         char d = st.charAt(j);
//         if(c==d){
//             count++;
//         }
//     }
//     if(count>ans){
//         ans=count;
//         w = c;
//     }
// }
// System.out.print(ans+" "+w);


// Reverse each word individually

// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// String ans = "";
//
// String words[] = s.split(" ");
//
// for(String w:words){
//     String n = w;
//     for(int i=n.length()-1;i>=0;i--){
//         ans += n.charAt(i);
//     }
//     if(ans.length()!=0){
//         ans+=" ";
//     }
// }
//
// System.out.print(ans.substring(0,ans.length()-1));
//



    }
}

