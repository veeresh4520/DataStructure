import java.util.*;
public class DublicateCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        Arrays.sort(num);
       for(int i=0;i<n-1;i++){
            // if(num[i]==num[i+1])
             int  j=i+1;
            while(j<n&&num[i]==num[j]){
                j++;
            }
            System.out.println(" The number : "+num[i]+" is repeaating for : "+(j-i));
            i=j-1;

         }
    }
}
