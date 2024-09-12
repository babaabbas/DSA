import java.util.Arrays;
public class _3rd {
    public static int sum(int[] arr){
        int max=0;
        for (int i=0;i<arr.length;i++){
            max=max+arr[i];
        }
        return max;
    }


    public static void main(String[] args){
        int max=0;
        int[] p={-1,2,-3,4,5};

        for(int i=0;i<5;i++) {
            for (int j = i + 1; j < 5 + 1; j++) {
                int[] k = new int[j - i];
                k = Arrays.copyOfRange(p, i, j);
                if (sum(k) > max) {
                    max = sum(k);
                }
                for (int w = 0; w < j - i; w++) {
                    System.out.println(k[w]);
                }
                System.out.println("////////////////\n");
            }
        }
        System.out.println(max);






    }

}
