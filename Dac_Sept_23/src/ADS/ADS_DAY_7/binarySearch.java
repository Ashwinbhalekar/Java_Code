package ADS.ADS_DAY_7;
class Search{
    public int binarySearch(int arr[],int start,int end,int key){
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid] == key){
                return 1;
            }
            if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return 0;
    }
}
public class binarySearch {
    public static void main(String[] args) {
        int page_num[] = {11,12,13,14,15,16};
        int key = 16;
        Search s = new Search();
        if(1==s.binarySearch(page_num, 0, page_num.length-1, key))
            System.out.println("Page found");
        else{
            System.out.println("Page not found");
        }
    }
}
