
class Reversearray {
    public void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        
    }
}