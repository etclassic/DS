package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class GetSubsequence {

    public static List<String> getSubsequence(String str){
        if(str.length() == 0){
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char ch = str.charAt(0);
        String istr = str.substring(1);

        List<String> ros = getSubsequence(istr);
        List<String> allSeq = new ArrayList<>();
        for (int i = 0; i < ros.size(); i++) {
            allSeq.add("_" + ros.get(i));
        }
        for (int i = 0; i < ros.size(); i++) {
            allSeq.add(ch + ros.get(i));
        }

        return allSeq;
    }
}
