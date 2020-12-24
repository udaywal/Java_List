import java.util.*;

public class Source {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        moveZerosToEnd(arr);
    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        int j = arr.length;
        int[] newArr = new int[j];
        ArrayList<Integer> lastZeroArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                lastZeroArray.add(arr[i]);
            }
            newArr[j - 1] = arr[i];
            j--;
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int j = arr.length;
        int[] newArr = new int[j];
        for (int i = 0; i < arr.length; i++) {
            newArr[j - 1] = arr[i];
            j--;
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

}
