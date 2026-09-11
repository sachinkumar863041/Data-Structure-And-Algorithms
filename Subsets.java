import java.util.*;

public class Subsets {

    public List<List<Integer>> subsetst(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        BackTrac(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    public void BackTrac(int[] nums, int start,
                         List<Integer> track,
                         List<List<Integer>> ans) {

        ans.add(new ArrayList<>(track));

        for (int i = start; i < nums.length; i++) {

            track.add(nums[i]);

            BackTrac(nums, i + 1, track, ans);

            track.remove(track.size() - 1);
        }
    }
}