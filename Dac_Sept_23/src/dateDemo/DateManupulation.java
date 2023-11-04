package dateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManupulation {
    public static void main(String[] args) {
        /*Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM, yyyy hh:mm");    //For user define format 
        
        //For converting Date to String
        String strDate = sdf.format(d);
        System.out.println(strDate);*/
        
        //For converting String to Date
        String sDate = "2023-10-23 10:37";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        try{
        Date dt = sdf.parse(sDate);
            System.out.println(dt);
        }
        catch(Exception e){
            e.getMessage();
        }
    }
}
