package Arrays;

import java.util.HashMap;

public class Twosum {
    public static void main(String[] args) {
        int[] a={2,7,11,15};
        int t=9;
        int[] b=twoSum(a,t);
        for(int v:b){
            System.out.println(v);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h=new  HashMap<>();

        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(h.containsKey(rem)){
                return new int[]{h.get(rem),i};
            }
            h.put(nums[i],i);
        }
        return new int[]{};
    }

}
