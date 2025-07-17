package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        subset(new ArrayList<>(), nums, 0, result);
        System.out.println(result);
    }
    public static void subset(List<Integer> ans, int[] arr, int i, List<List<Integer>> result){
        result.add(new ArrayList<>(ans));

        for (i=i; i<arr.length; i++){
            ans.add(arr[i]);
            subset(ans, arr, i+1, result);
            ans.remove(ans.size()-1);
        }
    }
}
