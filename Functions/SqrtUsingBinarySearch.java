public class SqrtUsingBinarySearch {
    public static void main(String[] args) {
        System.out.println(sqrt(49));
    }
    public static int sqrt(int x) {
        int start=0;
        int end=x;

        while(start<=end){
            int mid = (start+end)/2;
            if ((long)((long)mid*(long)mid) == x) return mid;
            else if ((long)((long)mid*(long)mid) > x) end = mid-1;
            else start = mid+1;
        }
        return end;
    }
}
