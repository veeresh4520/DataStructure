import java.util.*;
public class MenuDriven{
    public static void sum(int[] num){
        int n=num.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=num[i];
        }
        System.out.println("Sum of the elemnets is  : "+sum);
    }
    public static void max(int[] num){
        int max = num[0];
        int min = num[0];
        int n=num.length;
        for(int i=0;i<n;i++){
           if(num[i]>max){
            max = num[i];
           }
           if(num[i]<min){
            min = num[i];
           }
        }
        System.out.println("The minimum element is :"+min+" the maximum elemnt is : "+max);
    }
   public static void insert(int[] num, int x) {
    int n = num.length;
    int[] newa = new int[n + 1];
    int i = n - 1;
    // shift elements to right until correct position found
    while (i >= 0 && num[i] > x) {
        newa[i + 1] = num[i];
        i--;
    }
    // insert x
    newa[i + 1] = x;
    // copy remaining left elements
    for (int j = 0; j <= i; j++) {
        newa[j] = num[j];
    }
    // print array
    for (int j = 0; j < n + 1; j++) {
        System.out.print(newa[j] + " ");
    }
}

    public static int Search(int[] num ,int key){
        int n=num.length;
        int s=0;
        int end =n-1;
        while(s<=end){
            int mid = (s+end)/2;
            if(num[mid]==key){
                return mid;
            }else if(key<num[mid]){
                end=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static void reverse(int[] num ){
        int n=num.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(num[i]+" ");
        }
    }
    public static void delete(int[] num, int d) {
    int n = num.length;
    int pos = -1;
    // find position
    for (int i = 0; i < n; i++) {
        if (num[i] == d) {
            pos = i;
            break;   // ✅ break ONLY when found
        }
    }
    // element not found
    if (pos == -1) {
        System.out.println("Bhai that element doesn't exist!");
        return;
    }
    // shift elements left
    for (int i = pos; i < n - 1; i++) {
        num[i] = num[i + 1];
    }
    n--; // reduce size logically
    System.out.println("Array after deleting the element:");
    for (int i = 0; i < n; i++) {
        System.out.print(num[i] + " ");
    }
    System.out.println();
}
    public static void check(int[] num){
        int n=num.length;
        boolean asending = false;
        boolean desanding =false;
        for(int i=0;i<n-1;i++){
            if(num[i]<num[i+1]){
            asending=true;
            }if(num[i]>num[i+1]){
                desanding=true;
            }
        }
        if(asending==true){
            System.out.println("Yes bhai arranged in asending order ");
        }else if(desanding==true){
            System.out.println("Yes bhai arranged in descending order:");
        }else{
            System.out.println("No bhai not sorted (Neither in as or des)");
        }
    }
    public static void Separeate(int[] num){
        int n=num.length;
        int i=0;
        int j=n-1;
        while(i<j){
            while(num[i]<0){
                i++;
            }
            while(num[j]>=0){
                j--;
            }
            if(i<j){
                int temp = num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(num[k]+"  ");
        }
        System.out.println();

    }
   public static void merge(int[] num,int[] num1){
    int n=num.length;
    int m=num1.length;
    int p=n+m;
    int i=0,j=0,k=0;
    int[] c = new int[p];
    while(i<n&&j<m){
        if(num[i]<num1[j]){
          c[k++]=num[i++];
        }else{
            c[k++]=num1[j++];
        }
    }
    for(;i<n;i++){ 
        c[k++]=num[i];
    }
    for(;j<m;j++){
        c[k++]=num1[j];
    }
    System.out.println("the mergeed Array IS:");
    for(int q=0;q<p;q++){
        System.out.print(c[q]+" ");
    }
    System.out.println();
   }
  public static void Dublicate(int[] num){
    int n=num.length;
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
    for(int i=0;i<max;i++){
        System.out.println("The element :"+i+" is repeating for :"+h[i]);
    }
  }
  public static void SearchSum(int[] num,int target ){
    int n=num.length;
    int max = num[0];
    for(int i=0;i<n;i++){ 
        if(num[i]>max){
            max = num[i];
        }
    }
    int[] h = new int[max+1];
    for(int i=0;i<n;i++){
        if(h[target-num[i]]!=0){
            System.out.println(num[i]+" + "+(target-num[i])+" = "+ target);
        }
        h[num[i]]++;
    }
  }
 public static void Union(int[] num, int[] num1) {
    int n = num.length;
    int m = num1.length;
    int i = 0, j = 0, k = 0;
    int[] c = new int[n + m];
    // merge with duplicate check
    while (i < n && j < m) {
        if (num[i] < num1[j]) {
            if (k == 0 || c[k - 1] != num[i])
                c[k++] = num[i];
            i++;
        } 
        else if (num[i] > num1[j]) {
            if (k == 0 || c[k - 1] != num1[j])
                c[k++] = num1[j];
            j++;
        } 
        else {
            if (k == 0 || c[k - 1] != num[i])
                c[k++] = num[i];
            i++;
            j++;
        }
    }
    // remaining elements of num
    while (i < n) {
        if (k == 0 || c[k - 1] != num[i])
            c[k++] = num[i];
        i++;
    }
    // remaining elements of num1
    while (j < m) {
        if (k == 0 || c[k - 1] != num1[j])
            c[k++] = num1[j];
        j++;
    }
    System.out.println("A union B is:");
    for (int l = 0; l < k; l++) {
        System.out.print(c[l] + " ");
    }
    System.out.println();
}
    public static void main(String[] args) {
        Scanner sc  = new  Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int ch;
        do { 
            System.out.println("\n/////------MENU DRIVEN------//////");
            System.out.println("Enter choice bhai : ");
            System.out.println("1.Sum of Array :");
            System.out.println("2.Find max and min :");
            System.out.println("3.Insert an element In Sorted Array :");
            System.out.println("4.To Search An element :");
            System.out.println("5.REverse The Array :");
            System.out.println("6.Delet An Eelement :");
            System.out.println("7.Check Sorted or not :  ");
            System.out.println("8.Separeate Postive and Negative Numbers :");
            System.out.println("9.Merge two Arrays: ");
            System.out.println("10.Find dublicates :");
            System.out.println("11.Find sum of 2 numbers is a target :");
            System.out.println("12.Find A Union B :");
            System.out.println("13.Exit!");
            ch=sc.nextInt();
            switch (ch) {
                case 1:
                    sum(num);                    
                    break;
                case 2:
                    max(num);
                    break;
                case 3:
                    System.out.println("Enter the elemnt to insert" );
                    int x = sc.nextInt();
                    Arrays.sort(num);
                    insert(num, x);
                    break; 
                case 4:
                    System.out.println("enter the element to search :");
                    int key = sc.nextInt();
                    Arrays.sort(num);
                   int k =  Search(num, key);
                   if(k>=0){
                    System.out.println("Yes bhai the element is at index "+k);
                   }else{
                    System.out.println("NO bhai the element is not present Try Again !");
                   }
                    break;
                case 5:
                    reverse(num);
                    break;    
                case 6:
                    System.out.println("Enter the element tobe deleted");
                    int d=sc.nextInt();
                    delete(num, d);
                    break;
                case 7:
                    check(num);
                    break;  
                case 8:
                    System.out.println("Enter the Array size bhai ");
                    int p = sc.nextInt();
                    int[] num1  = new int[p];
                    System.out.println("Enter the element bhai");
                    for(int i=0;i<p;i++){
                        num1[i]=sc.nextInt();
                    }   
                    Separeate(num1);
                    break;   
                case 9:
                    System.out.println("Enter the Array 1 size and elements : ");
                    int a1=sc.nextInt();
                    int[] num2 = new int[a1];
                    for(int i=0;i<a1;i++){
                        num2[i]=sc.nextInt();
                    }    
                    System.out.println("enter the Array 2 size and elements :");
                    int a2 = sc.nextInt();
                    int[] num3 = new int[a2];
                    for(int i=0;i<a2;i++){
                        num3[i]=sc.nextInt();
                    }
                    Arrays.sort(num2);
                    Arrays.sort(num3);
                    merge(num2, num3);
                    break;
                 case 10:
                    Dublicate(num);
                    break;
                 case 11:
                    System.out.println("enter size of the array and lement sif the array ");
                    int s = sc.nextInt();
                    int[] num4 = new int[s];
                    for(int i=0;i<s;i++){
                        num4[i]=sc.nextInt();
                    }    
                    System.out.println("Enter the element target:");
                    int t =sc.nextInt();   
                    SearchSum(num4, t);
                   break;
                case 12:
                    System.out.println("Enter the size and elements of Set A");
                    int s1=sc.nextInt();
                    int[] num5 = new int[s1];
                    for(int i=0;i<s1;i++){
                        num5[i]=sc.nextInt();
                    }   
                    System.out.println("enter the size and elenents of Set B:");
                    int s2 = sc.nextInt();
                    int[] num6 = new int[s2];
                    for(int i=0;i<s2;i++){
                        num6[i]=sc.nextInt();
                    }
                    Arrays.sort(num5);
                    Arrays.sort(num6);
                    Union(num5, num6);
                    break;
                case 13:
                    System.out.println("Thank you Bhai !");   
                    break; 
                default:
                   System.out.println("enter a valid choise Bhai ");
            }
        } while (ch!=13);

    }
}