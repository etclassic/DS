package RecursionAndBacktracking;

public class TowerHanoi {

    public static void towerofHanoi(int n, int t1id, int t2id, int t3id){
        if(n==0){
            return;
        }

        towerofHanoi(n-1, t1id, t3id, t2id);
        System.out.println(n + "[" + t1id + "," + t2id + "]");
        towerofHanoi(n-1, t3id, t2id, t1id);
    }
}
