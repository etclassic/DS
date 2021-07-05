package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class GetMazePathWithJumps {

    public static List<String> getMazePathsWithJump(int sr, int sc, int dr, int dc){

        if(sr == dr && sc == dc){
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        List<String> allPaths = new ArrayList<>();
        for (int i = 1; i <= dr-sr; i++) {
            List<String> vPaths = getMazePathsWithJump(sr+i, sc, dr, dc);
            for (String vPath: vPaths) {
                allPaths.add("v" + i + vPath);
            }
        }

        for (int i = 1; i <= dc-sc; i++) {
            List<String> hPaths = getMazePathsWithJump(sr, sc+i, dr, dc);
            for (String hPath: hPaths) {
                allPaths.add("h" + i + hPath);
            }
        }

        for (int i = 1; i <= dr-sr && i <= dc-sc; i++) {
            List<String> dPaths = getMazePathsWithJump(sr+i, sc+i, dr, dc);
            for (String dPath: dPaths) {
                allPaths.add("d" + i + dPath);
            }
        }

        return allPaths;
    }
}
