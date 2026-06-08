class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            if (i == arr.length - 1) {
                arr[i] = -1;
            }else{
                arr[i] = max;
            }
        }
        return arr;
    }
}