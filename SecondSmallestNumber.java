import java.util.*;

public class SecondSmallestNumber {
    
    static int getSecondSmallest(int[] arr) {
        
        Arrays.sort(arr);
        return arr[1];

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " numbers to get second smallest from them");
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Result = " + getSecondSmallest(arr));
    }
}