package ADS.ADS_DAY_7;
class Search{
        public int linearSearch(int arr[], int size,int key){
        int i;
        for(i=0;i<size;i++){
            if(arr[i]==key)
                return 1;
        }
        return 0;
    }
}
public class LinearSearch {
    public static void main(String[] args) {
        int page_num[] = {89,91,34,50,0};
        int key = 100;
        Search s = new Search();
        if(1==s.linearSearch(page_num, page_num.length,key))
            System.out.println("Search Found");
        else
            System.out.println("Search not found");
    }
}
