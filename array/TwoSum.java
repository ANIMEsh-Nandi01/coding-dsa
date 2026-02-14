package array;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Step 1: The Outer Loop (Person A)
        // We go up to length - 1 because the last person has no one after them to pair with.
        for (int i = 0; i < nums.length; i++) {
            
            // Step 2: The Inner Loop (Person B)
            // 'j' always starts at 'i + 1'. 
            // Why? Because we don't need to check ourselves (i == j)
            // and we don't need to check pairs we've already seen (backwards).
            for (int j = i + 1; j < nums.length; j++) {
                
                // Step 3: The Check
                // Do these two numbers add up to the target?
                if (nums[i] + nums[j] == target) {
                    // Success! Return their indices immediately.
                    return new int[] { i, j };
                }
            }
        }
        
        // This line is just a fallback. The problem guarantees a solution exists.
        // But Java needs to know what to return if the loops finish without finding anything.
        return new int[] {}; 
    }
}