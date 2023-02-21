
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int[] newArr = new int[arr1.length + arr2.length];

        int value =0;

        while(value < newArr.length){

        }
        for(int i = 0; i < arr1.length; i++){
            newArr[value] = arr1[i];
            value+=1;
        }

        for(int j = 0; j < arr2.length; j++){
            newArr[value] = arr1[j];
            value+=1;
        }
        return newArr;
    }
}
