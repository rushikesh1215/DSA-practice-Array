package Arrays;
//
public class largestElementInArray {
    public static int largest(int[] arr) {
        int ans=Integer.MIN_VALUE;
        for(int var:arr){
            if(var>ans){
                ans=var;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] a={2,7,4,9,3,54,5,19,546,3668};
        System.out.println("Largest Element is:"+largest(a));


    }


}
