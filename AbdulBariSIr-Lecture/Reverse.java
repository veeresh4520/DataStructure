import java.util.*;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            int temp = num[i];
            num[i]=num[n-1-i];
            num[n-1-i]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        
    }
}