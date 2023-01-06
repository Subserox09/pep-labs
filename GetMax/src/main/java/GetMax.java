import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;

import java.util.Arrays;

public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        int greater1 = 0;
        int greater2= 0;
        int greater3 =0;

        for(int i =0; i < arr.length; i++){
            if((i+1) != arr.length){
                if((arr[i] < arr[i+1]) ) {//&& ((i+1) != arr.length)
                    greater1 = arr[i+1];
                }else if(arr[i] > arr[i+1]){
                    greater2 = arr[i];
                }
            }

            if(greater1 > greater2){
                greater3 = greater1;
            }else if(greater1 < greater2){
                greater3 = greater2;
            }
        }
        return greater3;
    }
}
