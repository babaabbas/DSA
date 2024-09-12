import java.util.Arrays;
public class _4th {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p=0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[p];
            p++;
        }
        Arrays.sort(nums1);
        for(int i=0;i<nums1.length;i++){
            System.out.println(nums1[i]);
        }



    }
    public static void main(String args[]){
        int[] arr={5,2,3,4,0,0,0};
        int[] arr2={4,6,7};
        merge(arr,4,arr2,3);


    }

}
