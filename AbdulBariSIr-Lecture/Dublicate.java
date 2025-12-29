import java.util.*;
public class Dublicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
         int last=0;
         for(int i=0;i<n-1;i++){
            if(num[i]==num[i+1]&&last!=num[i]){
                System.out.println(num[i]);
                last = num[i];

            }
         }
    }
}
