public class _2nd {
    public static void reverse(int[] arr){
        int[] reverse=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            reverse[i]=arr[arr.length-1-i];
        }
        for(int i:reverse){
            System.out.println(i+" ");
        }
    }
    public static void main(String[] args){
        int[] p={1,3,2,4,5};
        reverse(p);
    }

}
