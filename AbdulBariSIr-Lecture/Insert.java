import java.util.*;
public class Insert{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("enter the index to insert ");
        int index = sc.nextInt();
        System.out.println("enter the Element ");
        int x = sc.nextInt();
        if(index>n||index<0){
            System.out.println("Enter a valid index value that should be lexs than "+n);
        }
        int[] num1 = new int[n+1];
        for(int i=0;i<index;i++){
            num1[i]=num[i];
        }
        num1[index] =x;
        for(int i=index;i<n;i++){
            num1[i+1]=num[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(num1[i]+" ");
        }
    }
}