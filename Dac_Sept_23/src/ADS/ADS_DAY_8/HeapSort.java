package ADS.ADS_DAY_8;
class Heap{
    public void buildHeap(int arr[],int size){
        for(int i = size/2;i>=0;i--)
             Heapify(arr,i,size);
    }
    public void Heapify(int arr[],int index,int size){
        int left = 2*index+1;
        int right = 2*index+2;
        int max = index;
        
        if(left<=size && arr[left]>arr[max])
            max = left;
        
        if(right<=size && arr[right]>arr[max])
            max = right;
        
        if(index!=max){
            swap(arr, max, index);
            Heapify(arr, max, size);
        }
    }
    public void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void showSort(int arr[],int size){
        buildHeap(arr,size);
        while(size>0){
            swap(arr, 0, size);
            size--;
            Heapify(arr, 0, size);
        }
    }
}
public class HeapSort {
    public static void main(String[] args) {
        Heap h = new Heap();
        int[] arr = {50,10,30,60,80,20,100};
        h.showSort(arr, arr.length-1);
        System.out.println("Sorted Array");
        for(int i = 0; i <arr.length; i++){
            System.out.println(arr[i]+" ");
        }
    }
}
