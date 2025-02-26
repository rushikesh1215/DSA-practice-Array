package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintMaxSubArray {
    public static void main(String[] args) {
        int[] a={-2,1,-3,4,-1,2,5,1,-5,8,4};
        int[] b={5,4,-1,-9,7,8};
        List<Integer> l=new ArrayList<>();
        System.out.println(maxSubArray(b,l));
        for(var c:l){
            System.out.print(c+" ");
        }
    }
    public static int maxSubArray(int[] nums,List<Integer> l) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(nums[i]>sum){
                l.clear();
                l.add(nums[i]);
                sum=nums[i];
            }
            else{
                l.add(nums[i]);
            }
            ans=ans<sum?sum:ans;

        }
        return ans;
    }
}
