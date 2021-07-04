package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class GetStairPaths {

    public static List<String> getPaths(int n){

        if(n == 0){
            List<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n < 0){
            return new ArrayList<>();
        }


        List<String> path_1 =  getPaths(n-1);
        List<String> path_2 = getPaths(n-2);
        List<String> path_3 = getPaths(n-3);

        List<String> allpaths = new ArrayList<>();
        for (int i = 0; i < path_1.size(); i++) {
            allpaths.add("1" + path_1.get(i));
        }
        for (int i = 0; i < path_2.size(); i++) {
            allpaths.add("2" + path_2.get(i));
        }
        for (int i = 0; i < path_3.size(); i++) {
            allpaths.add("3" + path_3.get(i));
        }

        return  allpaths;
    }
}
