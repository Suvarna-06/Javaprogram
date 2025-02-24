package ex_26_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class LAb236_Map_P2 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put(null,"Sandhya");
        m1.put(null,"Sanndhya");
        m1.put("name","Dutta");
        System.out.println(m1);
        // {null=Sanndhya, name=Dutta}
    }
}
