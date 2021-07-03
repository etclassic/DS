package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeypadCombination {

    public static Map<Character, String> keypadMapping = new HashMap<>();

    static {
        keypadMapping.put('1', "abc");keypadMapping.put('6', "qrst");
        keypadMapping.put('2', "def");keypadMapping.put('7', "uv");
        keypadMapping.put('3', "ghi");keypadMapping.put('8', "wxyz");
        keypadMapping.put('4', "jkl");keypadMapping.put('9', ".;");
        keypadMapping.put('5', "mnop");keypadMapping.put('0', "?!");
    }

    public static List<String> getKeypadCombination(String str){
        if (str.length() == 0) {
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        List<String> iComb = getKeypadCombination(ros);
        String mappedString = KeypadCombination.keypadMapping.get(ch);
        List<String> allComb = new ArrayList<>();

        for (int i = 0; i < mappedString.length(); i++) {
            char ch_1 = mappedString.charAt(i);
            for (int j = 0; j < iComb.size(); j++) {
                allComb.add(ch_1 + iComb.get(j));
            }
        }

        return allComb;
    }

}
