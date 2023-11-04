package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetBackupDemo {
    public static void main(String[] args) {
        Set<Integer> orgSet = new HashSet<>();
        orgSet.add(12);
        orgSet.add(13);
        orgSet.add(10);
        orgSet.add(14);
        
        Set<Integer> bckSet = Collections.unmodifiableSet(new HashSet<>(orgSet));
        System.out.println(orgSet);
        System.out.println(bckSet);
    }
}
