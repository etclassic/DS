package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class GetMazePath {

    public static List<String> getMazePaths(int sr, int sc, int dr, int dc){
        if(sr > dr || sc > dc){
            return new ArrayList<>();
        }else if(sr == dr && sc == dc){
            List<String> bRes = new ArrayList<>();
            bRes.add("");
            return bRes;
        }

        List<String> list_c = getMazePaths(sr, sc+1, dr, dc);
        List<String> list_r = getMazePaths(sr+1, sc, dr, dc);

        List<String> allMazePaths = new ArrayList<>();
        for (int i = 0; i < list_c.size(); i++) {
            allMazePaths.add("h" + list_c.get(i));
        }
        for (int i = 0; i < list_r.size(); i++) {
            allMazePaths.add("v" + list_r.get(i));
        }

        return allMazePaths;
    }
}
