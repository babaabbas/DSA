import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.List;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> cool=new PriorityQueue<>((a,b)->
                Integer.compare(b.get(0)+b.get(1),a.get(0)+a.get(1)));
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                List<Integer> iol=new ArrayList();
                iol.add(nums1[i]);
                iol.add(nums2[j]);
                if(cool.size()<k){
                    cool.add(iol);

                }
                else{
                    int sumcurrent=iol.get(0)+iol.get(1);
                    int largestsum=cool.peek().get(0)+cool.peek().get(1);
                    if(sumcurrent<largestsum){
                        cool.poll();
                        cool.add(iol);
                    }
                    else{
                        break;
                    }
                }

            }

        }
        List<List<Integer>> kil=new ArrayList(cool);
        return kil;



    }
}