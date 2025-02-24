package ex_26_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab239_Map_Iterate {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("id",1);
        map.put("id",2);
        map.put("id2",null);
        map.put("id3",445);
        map.put("id4",null);

        // Iterate
        for (Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey() + " -> " + item.getValue());
//            System.out.println(item.getValue());
        }
    }
}
