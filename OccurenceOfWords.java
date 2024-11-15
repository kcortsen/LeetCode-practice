import java.util.HashMap;

public class OccurenceOfWords {
    public static HashMap<String, Integer> occurenceOfWords(String tekst) {
        HashMap<String, Integer> result = new HashMap<>();
        String[] stringArray = tekst.split(" ");


        for (String s : stringArray) {
            if (result.containsKey(s)) {
                result.put(s, result.get(s) + 1);
            } else {
                result.put(s, 1);
            }
        }
        return result;
    }
}
