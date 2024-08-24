import java.util.Scanner;
import java.util.Arrays;
public class _1st {
    public static int setmini(int[] A,int N){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(A[i]<mini){
                mini=A[i];
            }
        }
        return mini;
    }
    public static int setmax(int[] A,int N){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("size of the int");
        int o=sc.nextInt();
        int[] p=new int[o];
        System.out.println("Enter the array");
        for(int i=0;i<o;i++){
            p[i]=sc.nextInt();
        }

        System.out.println(setmini(p,o)+" "+setmax(p,o));
    }

}
