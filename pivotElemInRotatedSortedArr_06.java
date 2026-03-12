public class pivotElemInRotatedSortedArr_06 {
    static int findPivot(int[] arr){
        int n = arr.length;
        int lo=0,hi=n-1,ans=-1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] > arr[n-1]) lo= mid+1;
            else if(arr[mid] <= arr[n-1]){
                ans= mid;
                hi=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(findPivot(arr));
    }
}
