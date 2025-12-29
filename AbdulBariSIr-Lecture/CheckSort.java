import java.util.*;
public class CheckSort{
    public static int check(int[] num ){
        int n=num.length;
        for(int i=0;i<n-1;i++){
            if(num[i]>num[i+1])
                return 0;
        }
        return 1;
    }
    public static int des(int[] num ){
        int n=num.length;
        for(int i=0;i<n-1;i++){
            if(num[i]<num[i+1])
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int finalans=check(num);
        if(finalans==1){
            System.out.println("YEs sorrted bhai ");

        }else{
            System.out.println("No bhai not sorted ");
        }

    }
}