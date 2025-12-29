import java.util.*;
public class DublicateUnsorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int max = num[0];
        for(int i=0;i<n;i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        int[] h = new int[max+1];
        for(int i=0;i<n;i++){
            h[num[i]]++;
        }
        for(int i=0;i<=max;i++){
            System.out.println(num[i]+" "+i);

        }








































        // for(int i=0;i<n-1;i++){
        //    int count=1;
        //    if(num[i]!=-1)
        //     for(int j=i+1;j<n;j++){
        //         if(num[i]==num[j]){
        //             count++;
        //         num[j]=-1;
        //     }
        // }
        //     if(count>1)
        //         System.out.println(num[i]+" "+count);
        // }
    }
 }
