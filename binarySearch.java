 

public class binarySearch{

    static boolean binary(int[] a,int target){
        int n = a.length;
        int st = 0, end = n-1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(a[mid] == target) return true;
            else if(a[mid] > target) end = mid-1;
            else if(a[mid] < target)  st = mid+1;
        }

        return false;
    }
    public static void main(String[] args) {
        int[]  arr = {1,2,6,7,9,12,45,65,77,99};
        int target = 45;
        System.out.println(binary(arr, target));


    }
}

