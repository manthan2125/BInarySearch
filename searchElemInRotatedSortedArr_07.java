public class searchElemInRotatedSortedArr_07 {
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

    static int binarySearch(int[] arr,int lo,int hi,int x){
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == x) return mid;
            else if(arr[mid] > x ) hi =mid-1;
            else lo=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,10,1,2,3,5};
        int n = arr.length;
        int target = 11;
        int pivotIndex = findPivot(arr);
        if( target >= arr[pivotIndex] && target <arr[n-1])System.out.println(binarySearch(arr, pivotIndex,n-1, target));
        else System.out.println(binarySearch(arr, 0, pivotIndex-1, target));
        // int ans1  = binarySearch(arr, 0, pivotIndex-1, target);
        // int ans2 = binarySearch(arr, pivotIndex, n-1, target);
        // if(ans1 == -1 && ans2 != -1) System.out.println(ans2);
        // else if(ans1 != -1 && ans2 == -1) System.out.println(ans1);
        // else System.out.println(-1);
    }
}
