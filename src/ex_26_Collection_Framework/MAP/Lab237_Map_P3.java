package ex_26_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab237_Map_P3 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",1);
        map.put("id",2);
        map.put("id2",32);
        map.put("id3",445);
        map.put("id4",null);
        map.put("id6",null);
        map.put(null,107);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));

        System.out.println(map.keySet());
        System.out.println(map.values());


    }
}
