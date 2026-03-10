public class sqrt_04 {
    static int sqrt(int n){
        long lo = 0, hi = n;
        long ans=-1;
        while(lo <= hi){
            long mid = lo + (hi - lo)/2;
            if(mid*mid == n) return (int)mid;
            else if( mid*mid > n) hi =mid-1;
            else if(mid*mid < n) {
                ans=mid;
                lo =mid+1;
            }
        }
        return (int) ans;
}
    public static void main(String[] args) {
        int n = 24;
        System.out.println((sqrt(n)));
    }
}
