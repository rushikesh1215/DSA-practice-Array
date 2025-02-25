package Arrays;

import java.util.ArrayList;

public class union2SortedArray {
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5};
        int[] b={1, 2, 3, 6, 7};
        ArrayList<Integer> ans=  findUnion(a,b);
        for(int v:ans){
            System.out.print(v);
        }

    }
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        int al = a.length, bl = b.length;

        while (i < al && j < bl) {
            if (a[i] == b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            } else {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            }
        }

        while (i < al) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }
        while (j < bl) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }
}
