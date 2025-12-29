import java.util.*;

public class AdtAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Enter the Element to add");
        int k = sc.nextInt();

        // create new array with size n+1
        int[] newArr = new int[n + 1];

        // copy old elements
        for (int i = 0; i < n; i++) {
            newArr[i] = num[i];
        }

        // insert new element at end
        newArr[n] = k;

        // print new array
        for (int i = 0; i < n + 1; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
