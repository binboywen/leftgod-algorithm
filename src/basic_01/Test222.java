package basic_01;

public class Test222 {
    public static void main(String[] arg) {
        int [] arr = {3,4,5,1,3,8};
        System.out.println(getMax(arr, 0, arr.length-1));
    }

    public static int getMax(int[] arr, int L, int R) {

        if(L == R){
            return arr[L];
        }

        int mid = (L + R) / 2;
        int maxLeft = getMax(arr, L, mid);
        int maxRight = getMax(arr, mid + 1, R);
        return Math.max(maxLeft, maxRight);
    }
}
