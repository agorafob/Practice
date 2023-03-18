package TestJson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;

import java.util.Map;
import java.util.Set;

public class JsonExampleToMap {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{"+
                      "'name' : 'Alik',"  +
                      "'java':true,"+
                      "'age': 34, "+
                      "'permission': ['read','write'],"+
                      "'identify': {'phone':'12345','email':dd@mail.com} "+
                      "}";

        Gson gson = new Gson();
        Map map = gson.fromJson(json,Map.class);
        System.out.println(map);

        Set<String> set = map.keySet();

        for (String str:set) {
            System.out.println("-----------");
            System.out.println(str);
            System.out.println(map.get(str));
            System.out.println(map.get(str).getClass());
        }
    }
}
