package Week_04;

import java.util.HashMap;

public class Q4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1};
        System.out.println(subarraySum(nums1, 2));

        int[] nums2 = {1, -1, 0};
        System.out.println(subarraySum(nums2, 0));
    }

    static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixFrequency = new HashMap<>();
        prefixFrequency.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;
            int need = currentSum - k;

            if (prefixFrequency.containsKey(need)) {
                count += prefixFrequency.get(need);
            }

            prefixFrequency.put(currentSum, prefixFrequency.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}