public class CubeRTUsingBinarySearch {
    public static void main(String[] args) {
        System.out.println(cbrt(64));
        System.out.println(cbrt(343));
        System.out.println(cbrt(1331));
        System.out.println(cbrt(164));

    }
    public static int cbrt(int x) {
        int start=0;
        int end=x;

        while(start<=end){
            int mid = (start+end)/2;
            if ((long)((long)mid * (long)mid * (long)mid) == x) return mid;
            else if ((long)((long)mid * (long)mid * (long)mid) > x) end = mid-1;
            else start = mid+1;
        }
        return end;
    }
}
