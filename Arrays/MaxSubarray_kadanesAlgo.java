package Arrays;

public class MaxSubarray_kadanesAlgo {
    public static void main(String[] args) {
        int[] a={-2,1,-3,4,-1,2,1,-5,4};
        int[] b={5,4,-1,7,8};
        System.out.println(maxSubArray(b));

    }
    public static int maxSubArray(int[] nums) {
        int ans=nums[0];
        int sum=nums[0]; // To store the maximum sum

        // Iterate through each starting index of the subarray
        for (int i = 1; i < nums.length; i++) {
            sum=Math.max(nums[i],sum+nums[i]);
            ans=ans<sum?sum:ans;

        }

        return ans;
    }
}
