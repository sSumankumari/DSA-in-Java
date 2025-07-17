package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        arrange(new ArrayList<>(), nums, result);
        System.out.println(result);
    }
    public static void arrange(List<Integer> ans, int[] arr, List<List<Integer>> result){
        if (ans.size() == arr.length){
            result.add(new ArrayList<>(ans));
            return;
        }

        for (int i=0; i<arr.length; i++){
            if (ans.contains(arr[i])==false){
                ans.add(arr[i]);
                arrange(ans, arr, result);
                ans.remove(ans.size()-1);
            }
        }
    }
}
