public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        int condition =0;

            for(int i=0; i < arr.length-1; i++){
                if(arr[i] < arr[i+1]){
                    condition =1;
                }else if(arr[i] > arr[i+1]){
                    condition =0;
                    break;
                }
            }
            
            if(condition == 1){
                return true;
            }
          
        return false;
    }
}
