import java.util.*;
public class AlternateSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("sorted array:");
        int left = 0, right = n - 1;
        while (left <= right) {
            if (left == right) {
                System.out.print(arr[left] + " ");
            } else {
                System.out.print(arr[right] + " " + arr[left] + " ");
            }
            left++;
            right--;
        }
    }
}