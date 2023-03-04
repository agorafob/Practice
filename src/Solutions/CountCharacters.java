package Solutions;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static final String TEXT = "Давно выяснено, что при оценке дизайна и композиции читаемый текст мешает сосредоточиться.";

    public static void main(String[] args) {
      run(TEXT);
    }

    static String normalize(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))){
                result.append(str.charAt(i));
            }
        }
        return result.toString().toLowerCase();
    }

    static Map<Character, Integer> allCharacters (String str){
        Map<Character, Integer> map = new HashMap<>();
        int start = 1 ;
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                int value = map.get(str.charAt(i));
                map.replace(str.charAt(i), value,++value);
            }else {
                map.put(str.charAt(i),start);
            }
        }
        return map;
    }

    static void maxCharacter(Map<Character, Integer> map){
        int counter = 0;
        for (Map.Entry<Character, Integer> value : map.entrySet()) {
            if (value.getValue() > counter) {
                counter = value.getValue();
            }
        }
        print(map,counter);
    }

    static void print(Map<Character, Integer> map,int counter){
        for (Map.Entry<Character, Integer> value : map.entrySet()) {
            if (value.getValue() == counter) {
                System.out.println("letter : " + value.getKey() + " = " + value.getValue());
            }
        }
    }

    static void run(String text){
        System.out.println(normalize(text));
        System.out.println(allCharacters(normalize(text)));
        maxCharacter(allCharacters(normalize(TEXT)));
    }
}
