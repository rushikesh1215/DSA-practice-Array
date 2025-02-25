package Arrays;

public class rotateArrayByK{
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        int k=3;

       rotate(a,k);
       for(int e:a){
           System.out.print(e+" ");
       }
    }
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length;
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
   static void rev(int[]a,int b, int c){
        while(b<c){
            int temp=a[b];
            a[b]=a[c];
            a[c]=temp;
            b++;
            c--;
        }
}}

