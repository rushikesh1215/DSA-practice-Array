package Arrays;

public class RearrangearrayBySign {
    public static void main(String[] args) {
        int[] a={3,1,-2,-5,2,-4};
        int[] b=rearrangeArray(a);
        for(var v:b){
            System.out.print(v+" ");
        }
    }

    public static int[] rearrangeArray(int[] nums) {
        int positive =0, negative = 1;
        int[] arr = new int[nums.length];
        for(int num: nums){
            if(num > 0){
                arr[positive] = num;
                positive += 2;
            }else {
                arr[negative] = num;
                negative += 2;
            }
        }
        return arr;

}
}
