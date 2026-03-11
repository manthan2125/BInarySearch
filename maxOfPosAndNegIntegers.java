public class maxOfPosAndNegIntegers {
    static int maxOfPosAndNeg(int[] nums){
        int n = nums.length;
        int lo=0,hi=n-1;
        int posCount=0, negCount=0;
        while(lo <= hi){  // for calculating neg count calc largest negative number 
            int mid = lo+(hi-lo)/2;
            if(nums[mid] >= 0) hi = mid-1;
            else lo = mid+1;
        } 
        // negCount = idx+1;
        negCount = lo; 

        lo=0;
        hi=n-1;
        while(lo <= hi){  // for calculating pos count calc smaleest positve non zero number 
            int mid = lo+(hi-lo)/2;
            if(nums[mid] <= 0) lo = mid+1;
            else hi = mid-1;
        }
        // posCount = n-idx;
        posCount = n-lo;
        return Math.max(posCount,negCount);   
    }
    
    public static void main(String[] args) {
        int[] arr = {-5,-4,-3,0,0,0,1,2,3,4,5,6,8};
        System.out.println(maxOfPosAndNeg(arr));
    }
}
