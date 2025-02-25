package Arrays;

public class secondLargestInArray {
    public static int getSecondLargest(int[] arr) {
        int ans=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        for(int var:arr){
            if(var>ans){
                ans=var;
            } }
        for(int var:arr){
            if(var>s && var<ans){
                s=var;
            } }
        if(s==Integer.MIN_VALUE){
            return -1;}
       return s;
        // Code Here
    }
    public static void main(String[] args) {
        int[] a={2,7,4,9,3,54,5,19,546,3668};
        System.out.println(getSecondLargest(a));
    }
}
