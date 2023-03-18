package TestJson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class JsonExampleToClass {
    public static void main(String[] args) throws JsonProcessingException {
        String json = "{"+
                      "'firstName' : 'Alik',"  +
                      "'secondName':'Petrosyan',"+
                      "'age':'34'"+
                      "}";


        Gson gson = new Gson();
        User user = gson.fromJson(json, User.class);
        user.setAge("30");

        System.out.println(user);
        System.out.println(gson.toJson(user));

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES,true);
        User us = objectMapper.readValue(json, User.class);
        System.out.println(us.toString());
        System.out.println(objectMapper.writeValueAsString(us));

        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(us));
    }
}
