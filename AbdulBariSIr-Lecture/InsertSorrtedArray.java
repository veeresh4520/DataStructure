import java.util.*;
public class InsertSorrtedArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n+1];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int x = sc.nextInt();
     int   i=n-1;
        while(i>=0&&num[i]>x){
            num[i+1]=num[i];
            i--;
        }
        num[i+1]=x;
        for(int j=0;j<n+1;j++){
            System.out.print(num[j]+" ");

        }
    }
}