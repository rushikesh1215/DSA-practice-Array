package Arrays;
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).


public class removeDuplicate {
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static  int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1; j<nums.length; j++)
        {
            if(nums[i] != nums[j])
            {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}
