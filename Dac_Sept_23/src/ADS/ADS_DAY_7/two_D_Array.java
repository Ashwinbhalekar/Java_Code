/*Write a Java program to determine the row and column position of a specified number in a
provided 2-dimensional array */
package ADS.ADS_DAY_7;
public class two_D_Array {
    public void position(int arr[][],int key){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if(arr[i][j]==key)
                    System.out.println("row: "+i+",column: "+j);
//                    return 1;       
            }  
        }
//        return 0;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4}};
        two_D_Array t = new two_D_Array();
        int key = 1;
       t.position(arr, key);
//        if(1==t.position(arr, key))
//        {
//           System.out.println(t.position(arr,key));
//            System.out.println("Search Found");
//        }
//        else
//        {
//          System.out.println(t.position(arr,key)); 
//            System.out.println("Search not found");
//        }
//           System.out.println(a);

    }
}
