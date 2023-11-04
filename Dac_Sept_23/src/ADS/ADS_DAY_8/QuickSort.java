package ADS.ADS_DAY_8;

public class QuickSort {
    int pIndex;
    public int partition(int arr[],int start, int end){
        pIndex = start;
        int pivote = arr[end];
        for(int i = start;i<end;i++){
            if(arr[i]<pivote){
                swap(arr, i, pIndex);
                pIndex++;
            }
        }
        swap(arr,pIndex,end);
        return pIndex;
    }
    
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void showSort(int arr[],int start,int end){
        if(start<end){
            pIndex = partition(arr, start, end);
            showSort(arr,start,pIndex-1);
           showSort(arr,pIndex+1,end);
        }
    }
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = {50,10,30,60,20,100};
        qs.showSort(arr, 0, arr.length-1);
        for(int n:arr)
            System.out.println(n);
    }

}
