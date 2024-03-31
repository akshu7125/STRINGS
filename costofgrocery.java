import java.util.*;
public class costofgrocery {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        
            int cost[]=new int[n];
            int freshness[]=new int[n];
            for (int i = 0; i <n; i++) {
                cost[i]=sc.nextInt();
            }
            for(int j=0;j<n;j++){
                freshness[j]=sc.nextInt();
            }
            int total=0;
            for(int i=0;i<n;i++){
                if(freshness[i]>x){
                    total+=cost[i];
                }
            }
            System.out.println(total);

        }
        
    }

