package Arrays;

public class isArraySorted {
    public static void main(String[] args) {
       int[] a= {3,4,5,1,2};
       int b[]={2,1,3,4};
        System.out.println(check(a));
        System.out.println(check(b));
    }

        public static boolean check(int[] nums) {
            int count = 0, n = nums.length;
            for (int i = 0; i < n; i++)
                if (nums[i] > nums[(i+1) % n] && ++count > 1) return false;
            return count <= 1;
        }
}

