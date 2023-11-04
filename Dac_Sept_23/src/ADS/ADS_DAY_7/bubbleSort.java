package ADS.ADS_DAY_7;

class Bubble {

    public void showSort(int arr[]) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class bubbleSort {

    public static void main(String[] args) {
        int[] arr = {50, 25, 5, 20, 10};
        Bubble b = new Bubble();
        b.showSort(arr);
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
