import java.util.*;
public class MissingSorted1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int sum=0;
        
        for(int i=0;i<n;i++){
            sum+=num[i];

        }
        int m=num[n-1];
        int s = (m*(m+1))/2;
        System.out.println("The missing Elemnt is : "+(s-sum));
    }
}
