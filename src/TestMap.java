import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("one","one1");
        map.put("two","two2");
        map.put("three","three3");
        map.put("four","four4");
        map.put("five","five5");

        Set<Map.Entry<String, String>> set = map.entrySet();

        for (Map.Entry<String,String> entry: set ) {
            System.out.println(entry.getKey() + ">>>" + entry.getValue());
        }
        System.out.println();

        for (String s :map.keySet()){
            System.out.println(s + ">>>" + map.get(s));
        }

        System.out.println();

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
