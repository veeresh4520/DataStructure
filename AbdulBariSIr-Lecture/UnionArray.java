import java.util.*;
public class UnionArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int m = sc.nextInt();
        int[] num1 = new int[m];
        for(int i=0;i<m;i++){
            num1[i]=sc.nextInt();
        }
        Arrays.sort(num);
        Arrays.sort(num1);

        int p = n+m;
        int[] c = new int[p];
        int i=0,j=0,k=0;
         while(i<n&&j<m){
            if(num[i]<num1[j]){
                c[k++]=num[i++];
            }else if(num[i]>num1[j]){
                c[k++]=num1[j++];
            }else{
                c[k++]=num[i++];
                j++;
            }
         }
         for(;i<n;i++){
            c[k++]=num[i];
         }
         for(;j<m;j++){
            c[k++]=num1[j];
         }
         for(int l=0;l<k;l++){
            System.out.print(c[l]+" ");
         }
    }
}