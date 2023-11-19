import java.util.ArrayList;
import java.util.List;

public class SubsetSumBacktracking {
	public static void subsetSum(int[] nums, int target) {
		List<Integer> currentSubset = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		backtrack(nums, target, 0, currentSubset, result);

		if (result.isEmpty()) {
			System.out.println("No subset found with the sum equal to the target.");
		} else {
			System.out.println("Subsets with the sum equal to the target:");
			for (List<Integer> subset : result) {
				System.out.println(subset);
			}
		}
	}

	private static void backtrack(int[] nums, int target, int startIndex, List<Integer> currentSubset,List<List<Integer>> result) {
		if (target == 0) {
			// Subset with the sum equal to the target found
			result.add(new ArrayList<>(currentSubset));
			return;
		}

		if (target < 0 || startIndex >= nums.length) {
			// Invalid subset
			return;
		}

		// Include the current number in the subset
		currentSubset.add(nums[startIndex]);
		backtrack(nums, target - nums[startIndex], startIndex + 1, currentSubset, result);
		currentSubset.remove(currentSubset.size() - 1);

		// Exclude the current number from the subset
		backtrack(nums, target, startIndex + 1, currentSubset, result);
	}

	public static void main(String[] args) {
		int[] nums = { 2, 4, 6, 8, 10 };
		int target = 14;
		subsetSum(nums, target);
	}
}