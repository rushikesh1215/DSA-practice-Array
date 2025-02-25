package Arrays;

public class movezero {
    public static void main(String[] args) {
        int[] a={0,1,0,3,12};
        moveZeroes(a);
        for(int v:a){
            System.out.print(v);
        }

    }
    public static void moveZeroes(int[] nums) {
        int j = 0; // Pointer for the next non-zero element

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap only if `i` and `j` are different
                if (i != j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++; // Move `j` to the next position
            }
        }

    }
}
