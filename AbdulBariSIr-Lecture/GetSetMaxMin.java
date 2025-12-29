import java.util.*;
public class GetSetMaxMin{
    public static int get(int[] num , int index ){
        int n = num .length;
        if(index>=0&&index<=n){
            return num [ index];
        }
        return -1;
    }
    public static int set(int[] num , int index , int x){
        int n=num.length;
        for(int i=0;i<n;i++){
            if(n>=0&&n<=n){
                num[index]=x;
            }
        }
        return x;
    }
    public static int max(int[] num ){
        int n=num.length;
        int max = num[0];
        for(int i=0;i<n;i++){
            if(num[i]>max){
                max = num[i];
            }

        }
        return max;
    }
    public static int min(int[] num ){
        int n=num.length;
        int min = num[0];
        for(int i=0;i<n;i++){
            if(num[i]<min){
                min = num[i];
            }

        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n =sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int index= sc.nextInt();
        System.out.println("the index valus is : "+get(num, index));
        System.out.println("enter thr index to replace it : ");
        int j = sc.nextInt();
        System.out.println("Enter the value to replace ");
        int r =sc.nextInt();
        System.out.println("The index is replaced with it "+set(num,j,r));
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        
        System.out.println("The max element is  : "+max(num)    );
        System.out.println("The min element is  : "+min(num)    );
    }
}