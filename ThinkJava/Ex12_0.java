// Recursive Binary search

class Ex12_0 {
    
    private static int bSearch(int[] arr, int item, int low, int high) {
        if (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == item)
                return mid;
            else if (arr[mid] < item) {
                return bSearch(arr, item, mid+1, high);
            }
            else {
                return bSearch(arr, item, low, mid-1);
            }     
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 15, 30, 45, 100, 120, 344};

        System.out.println(bSearch(arr, 100, 0, arr.length-1));
        System.out.println(bSearch(arr, 10, 0, arr.length-1));
    }
}