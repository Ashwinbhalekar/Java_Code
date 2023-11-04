package ADS.ADS_DAY_8;
public class HashTable {
    static final int SIZE = 5;
    int arr[] = new int[SIZE];

    public HashTable() {
        for (int i = 0; i < SIZE; i++)
            arr[i] = -1;
    }

    public int hashInsert(int value) {
        int key = value % SIZE;
        int index = key;
        int count = 0;
        while (arr[index] != -1) { 
            if (arr[index] == value) {
                System.out.println("Value already exists in the table.");
                return 0;
            }
            index = (index + 1) % SIZE;
            count++;
            if (count == SIZE) { 
                System.out.println("Table is full.");
                return 0;
            }
        }
        arr[index] = value; 
        return 1;
    }
    public int delete(int value){
       int key = value % SIZE;
       int index = key;
       while(arr[index]!=value){
           index = (index+1) % SIZE;
           if(index == key)
               return 0;
       }
       arr[index] = -1;
       return 1;
    }
        public int search(int value){
       int key = value % SIZE;
       int index = key;
       while(arr[index]!=value){
           index = (index+1) % SIZE;
           if(index == key)
               return 0;
       }
       return 1;
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(); 
        ht.hashInsert(5); 
        ht.hashInsert(12);
        ht.hashInsert(15);
        ht.hashInsert(22);
        ht.hashInsert(2);
        //ht.hashInsert(19); 
        
        System.out.println(ht.delete(12));
        System.out.println(ht.search(5));
        System.out.println(ht.hashInsert(10));
    }
}

