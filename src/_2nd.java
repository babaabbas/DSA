public class _2nd {
    public static void reverse1(int[] arr){
        int[] reverse=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            reverse[i]=arr[arr.length-1-i];
        }
        for(int i:reverse){
            System.out.println(i+" ");
        }
    }

    public static void reverse2(int[] arr){
        int start=0;
        int end=arr.length-1;
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public static void reverse3(int[] arr,int start,int end){

        if(start>=end){
            return;
        }
        int temp=arr[start];
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverse3(arr,start+1,end-1);
    }


    public static void main(String[] args){
        int[] p={1,2,3,4,5};
        reverse1(p);
        System.out.println("////////////////\n");
        reverse2(p);
        for(int i=0;i<5;i++){
            System.out.println(p[i]);
        }
        int[] o={5,4,3,2,1};
        reverse3(o,0,4);
        System.out.println("////////////////\n");
        for(int i=0;i<5;i++){
            System.out.println(o[i]);
        }

    }

}
