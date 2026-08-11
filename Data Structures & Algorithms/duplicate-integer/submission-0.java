class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>(); // O(1)

        for(int num : nums){  // O(n)
            if(!seen.add(num)) return true; //O(1) + O(1)
        }

        return false; // O(1)
    } // O(n)
}