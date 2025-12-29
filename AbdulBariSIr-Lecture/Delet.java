import java.util.*;
public class Delet{
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int n=sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
         }
             System.out.println("Enter the Position of the element to Delete");
         int d = sc.nextInt();
         if(d<1||d>n){
            System.out.println("Invalid position ");
            return ;
         }
         int[] num1 = new int[n-1];
         for(int i=0;i<d-1;i++){
            num1[i]=num[i];
         }
         for(int i=d;i<n;i++){
            num1[i-1]=num[i];
         }
          for(int i=0;i<n-1;i++){
            System.out.print(num1[i]+" ");
          }
   }
}
