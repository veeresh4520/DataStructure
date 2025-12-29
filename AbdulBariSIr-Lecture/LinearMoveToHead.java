 import java.util.*;
 public class LinearMoveToHead{ 
 public static int  MoveToHead(int[] num , int key ){
        int n=num.length;
        for(int i=0;i<n;i++){
            if(num[i]==key){
               int temp = num [ i ];
               num [ i] =num[0];
               num[0]=temp;
               return i;
            }
        }
        return -1;

    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter the key to search");
        int k =sc.nextInt();
         System.out.println("\nMove to head array");
         System.out.println(MoveToHead(num, k));
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
    }
}
