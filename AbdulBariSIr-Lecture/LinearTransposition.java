import java.util.*;
public class LinearTransposition{
    public static int Tranposition(int[] num ,int key){
        int n = num.length;
        for(int i=0;i<n;i++){
            if(num[i]==key){
               int temp = num[i];
               num[i]=num[i-1];
               num[i-1]=temp;
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
        System.out.println(Tranposition(num, k));
        System.out.println("Tranaposition Array");
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }    


    }
    
}