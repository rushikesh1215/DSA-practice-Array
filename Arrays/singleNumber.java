package Arrays;

public class singleNumber {
    public static void main(String[] args) {
        int[]a={4,1,2,1,2};
        System.out.println(singleNumber(a));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        //xor of same number results 0
        // &
        //xor is associative
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
