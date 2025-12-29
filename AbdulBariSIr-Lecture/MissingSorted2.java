import java.util.*;
public class MissingSorted2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int l = num[0];
        int h = num [n-1];
        int diff=l;
        for(int i=0;i<n;i++){
            if(num[i]-i!=diff){
                System.out.println("The missing elements is : "+(diff+i));
                            break;
            }

        }
        
    }
}
