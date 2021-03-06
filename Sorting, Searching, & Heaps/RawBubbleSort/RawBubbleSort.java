/*
  Bubble Sort
*/
import java.util.*;

public class RawBubbleSort {
  public static void main(String args[]) {
    int[] numbers = new int[]{ 1, -40, 4, 5, 8, 3, 4, 1, 4, 5, 100, -12 };
    bubbleSort(numbers);
    System.out.println(Arrays.toString(numbers));
  }

  private static void bubbleSort(int[] arr) {
    int lastIndex = arr.length - 1;

    for (int i = lastIndex; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        if (arr[j - 1] > arr[j]) {
          swap(arr, j - 1, j);
        }
      }
    }
  }

  private static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
