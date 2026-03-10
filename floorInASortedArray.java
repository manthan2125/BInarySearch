public class floorInASortedArray {
    static int floor(int[] arr,int x){
        int n= arr.length;
        int st=0,end=n-1,idx=-1;
        while(st <= end){
            int mid = st +(end-st)/2;
            if(arr[mid] > x) end =mid-1;
            else if(arr[mid] <= x){
                idx=mid;
                st=mid+1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,6,7,9,12,54,78};
        int tar = 6;
        System.out.println(floor(arr,tar));
    }
    
}
