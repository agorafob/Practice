package TestText;

import java.util.*;

public class TestText {

    public static void main(String[] args) {

    }

    static void everyWordInQuestionSentence(){
        String[] rawSentences = Text.TEXT.split(Text.regexForSentencesEndKeepQuestion);
        List<String[]> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (String s : rawSentences) {
            s = s.replaceAll(Text.regexForSentencesStart, "").trim();
            if(s.contains("?")){
                Arrays.stream(s.split(Text.regexForSentencesEndKeepQuestion)).
                        filter(l->l.contains("?")).forEach(st-> Arrays.stream(st.split("[.!:…]")).
                                filter(o->o.contains("?")).
                                forEach(ar->list.add(ar.replace(",","").
                                        replace("?","").
                                        trim().split(" "))));
            }
        }

        for (String[] s:list) {
            set.addAll(Arrays.asList(s));
        }
        System.out.println(set);
    }

    static void sentencesUp() {
        String[] rawSentences = Text.TEXT.split(Text.regexForSentencesEnd);
        Map<String, Integer> map = new HashMap<>();

        for (String sn : rawSentences) {
            String tmp = sn.replaceAll(Text.regexForSentencesStart, "").trim();
            if (tmp.length() > 1) map.put(tmp, tmp.split(" ").length);
        }
        List<Map.Entry<String, Integer>> list = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();
        list.forEach(i -> System.out.println(i.getKey() + "\n" + i.getValue()));
/*
        int counter = 0;
        for (Map.Entry<String, Integer> value : map.entrySet()) {
            if (value.getValue() > counter) {
                counter = value.getValue();
            }
        }
        for (Map.Entry<String, Integer> value : map.entrySet()) {
            System.out.println(value.getKey() + "\n" + value.getValue());
            if (value.getValue() == counter) {
                System.out.println(value.getKey() + "\n" + value.getValue());
            }
        }
*/
    }

}
