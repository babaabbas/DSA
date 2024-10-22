public class leetheap {

    public static void heapify(int arr[],int n,int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(i!=largest){
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            heapify(arr,n,largest);
        }

    }
    static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static int findKthLargest2(int[] nums, int k) {

        int[] arr=nums;
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify(arr,i,0);
        }
        return arr[n-k];

    }
    static int findKthLargest(int[] nums, int k) {

        int[] arr=nums;
        int n=arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>0;i--){
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            heapify(arr,i,0);
        }
        for(int l=0;l<arr.length;l++){
            System.out.println(arr[l]);
        }
        return arr[n-k];

    }
    public static void main(String[] args){
        int arr[]={3,2,3,1,2,4,5,5,6};
        int cool=findKthLargest2(arr,4);
        System.out.println(cool);
    }
}