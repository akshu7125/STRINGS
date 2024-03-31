public class char_occurence {
    public static void main(String[] args) {
        String s="opentext";
        //char[] arr=s.toCharArray();
        //StringBuilder sb=new StringBuilder();
        int count=1;
        for (int i = 0; i < s.length(); i++) {
            char ch= s.charAt(i);
            if(ch=='t'){
                s=s.replace(s.valueOf(ch),s.valueOf(count));
                count++;
            }
        }
        System.out.println(s);
        }
}
/*
 * String s="akshita";
 * int count=1;
 * for(int i=0;i<s.length();i++){
 *  char ch=s.charAt(i);
 * if(ch=='t'){
 * s=s.replaceFirst(s.valueOf(ch),s.valueOf(count));
 * count++;
 * }
 * }
 */