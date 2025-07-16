package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GivenCoinsAndTarget {
    public static void main(String[] args) {
        int[] coins = {2,3,5};
        int target = 8;
        exchange("", target, coins, 0);
        System.out.println();
        exchange(new ArrayList<>(), target, coins, 0);
    }
    public static void exchange(String ans, int target, int[] coins, int idx){
        if (target==0){
            System.out.print(ans+" ");
            return;
        }
        for (int i=idx; i<coins.length; i++){
            if (target>=coins[i]){
                exchange(ans+coins[i], target-coins[i], coins, i);
            }
        }
    }
    public static void exchange(List<Integer> ans, int target, int[] coins, int i){
        if (target==0){
            System.out.print(ans+" ");
            return;
        }
        while (i<coins.length){
            if (target>=coins[i]){
                ans.add(coins[i]);
                exchange(ans, target-coins[i], coins, i);
                ans.remove(ans.size()-1);
            }
            i++;
        }
    }
}
