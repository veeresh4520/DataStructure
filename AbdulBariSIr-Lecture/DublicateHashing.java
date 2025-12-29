import java.util.*;
public class DublicateHashing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        Arrays.sort(num);
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
         System.out.println("The number "+i+" is repeating for "+h[i]);
        }
    }
}