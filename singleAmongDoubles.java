public class singleAmongDoubles {
    static int single(int[] arr){
        int n = arr.length;
        if (n==1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];       // corner cases
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if((arr[mid] != arr[mid-1])&&(arr[mid] != arr[mid+1]))return arr[mid];
            
            int first=mid,second=mid;
            if(arr[mid] == arr[mid-1]) first = mid-1;
            else second = mid+1;
            
            int leftCount = first-lo;
            int rightCount = hi - second;
            if(leftCount%2 == 0) lo = second +1;
            else hi = first - 1;
        }
        return 46162; 
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,5,5,6,6,7,7,8,8};
        System.out.println(single(arr));
    }
}
