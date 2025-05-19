import java.util.HashSet;

public class MaximumConsucutiveSequence {

    public static int maximumConsucutiveSequence(int nums[]) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        int result = 0;

        for(int n : nums) {
            set.add(n);
        }

        for(int e : set) {
            if(!set.contains(e-1)) {
                int curr = e;
                int count = 1;
                
                while(set.contains(curr+1)) {
                    curr++;
                    count++;
                }
                result = Math.max(result, count);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {3, 4, 34, 5, 2, 1};
        int ans = maximumConsucutiveSequence(nums);
        System.out.println("Maximum consucutive sequence: "+ ans);
    }
}

