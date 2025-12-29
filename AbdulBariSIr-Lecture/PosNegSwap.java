import java.util.*;
public class PosNegSwap{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n=sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<j){
            while(num[i]<0){
                i++;
            }
            while(num[j]>=0){
                j--;
            }
            if(i<j){
                int temp = num [i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
        for(int k=0;k<n;k++){
          System.out.print(num[k]+" ");
        }
        
    }
}