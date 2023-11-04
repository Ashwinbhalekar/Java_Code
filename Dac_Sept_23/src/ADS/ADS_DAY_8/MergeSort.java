package ADS.ADS_DAY_8;

public class MergeSort {

    void merge(int arr[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i, j, k;
        i = start;
        j = mid + 1;
        k = 0;

        //Copare and insert smaller element into temp
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        //For remaining elements of first array
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        //for remaining elements of second array
        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        //copy temp to orignal array
        k = 0;
        for (i = start; i <= end; i++) {
            arr[i] = temp[k++];
        }
    }

    void mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = {20, 50, 70, 10, 50, 33, 55, 22, 9};
        ms.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array");

        for (int n : arr) {
            System.out.println(n);
        }

    }

}

