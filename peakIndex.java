public class peakIndex {

    static int peakindex(int[] a){
        int n = a.length;
        int st = 1, end = n-2;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(a[mid] > a[mid-1] && a[mid] > a[mid+1]) return mid;
            else if (a[mid] > a[mid-1] && a[mid] < a[mid+1]) st = mid + 1;
            else end = mid - 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,4,3,1};
        System.out.println(peakindex(arr));
    }
}
