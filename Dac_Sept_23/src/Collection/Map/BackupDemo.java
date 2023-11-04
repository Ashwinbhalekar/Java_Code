package Collection.Map;

import java.util.Arrays;
import java.util.List;

public class BackupDemo {
    public static void main(String[] args) {
        List<Integer> orglst = Arrays.asList(100,200,300);
        
        List<Integer> bckuplst = orglst.subList(0, 3/*orglst.size()*/);
        
        System.out.println(orglst);
        System.out.println(bckuplst);
    }
}
