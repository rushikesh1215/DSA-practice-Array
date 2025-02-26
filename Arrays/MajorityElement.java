package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] a={2,2,1,1,1,2,2};
        System.out.println(majorityElement(a));

    }
    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int votes = 1;

        for(int i=1; i<nums.length; i++){
            if(votes == 0){
                candidate = nums[i];
                votes = 1;
            }
            else if (candidate == nums[i]){
                votes++;
            }
            else{   // candidate != current candidate
                votes--;
            }
        }
        return candidate;
    }
}
