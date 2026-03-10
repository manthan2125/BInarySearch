public class arrangingCoins_05 {
    static int sqrt(long n){
        if(n==0) return 0;
        long lo=1, hi = n,ans = -1;
        while(lo <= hi){
            long mid = lo +(hi-lo)/2;
            if(mid == n / mid) return (int)mid;
            else if(mid < n / mid) {
                ans = mid;
                lo= mid+1;
            }
            else hi =mid-1;
        }
        return (int)ans;
    }

    static int arrange(int n){
        long m = n;
        return (sqrt(8*m + 1) -1) / 2;
    }
    public static void main(String[] args) {
        int n = 55;
        System.out.println(arrange(n));
    }
}
