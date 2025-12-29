import java.util.*;
public class BinarySearch{
    public static int Bin(int[] num ,int key ){
        int n=num.length;
        int s = 0;
        int e = n-1;
        
        while(s<=e){
            int mid = (s+e)/2;
            if(num[mid]==key){
                return mid;
            }else if(key<num[mid]){
                e=mid-1;
            }else{
               
                s=mid+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        Arrays.sort(num);
        System.out.println("Enter the key to search ");
        int key = sc.nextInt();
        System.out.println("The key is at index : "+Bin(num, key));
        for(int i=0;i<n;i++){
           System.out.print(num[i]+" ");
        }
    }
}
