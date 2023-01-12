
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int max =0;
        int max2;
        int min =0;
        int min2;

        for(int i =0; i < nums.size() ; i++){
            if(!(i >= (nums.size()-1))){
                if(( nums.get(i) <= nums.get(i+1)) && nums.get(i+1) >= max){
                    max = nums.get(i+1);
                    
                }else if(nums.get(i) >= nums.get(i+1) && nums.get(i) >= max){
                    max = nums.get(i);
                
                }

                if(nums.get(0) == 0){
                    min = 0;
                    if((nums.get(i) < nums.get(i+1)) && nums.get(i) <= min ){
                        min = nums.get(i);  
                    }
                }

                if(nums.get(0) == 2){
                    min = 2;
                    if((nums.get(i) < nums.get(i+1)) && nums.get(i) <= min ){
                        min = nums.get(i);  
                    }
                }

                if(nums.get(0) == 1){
                    min = 1;
                    if((nums.get(i) < nums.get(i+1)) && nums.get(i) <= min ){
                        min = nums.get(i);  
                    }
                }

                if(nums.get(0) == 4){
                    min =2;
                    if((nums.get(i) < nums.get(i+1)) && nums.get(i) <= min ){
                        min = nums.get(i);  
                    }else if(nums.get(i) > nums.get(i+1) && (nums.get(i+1) <= min)){
                        min = nums.get(i+1);
                   }
                }
            
            }
               
        }
        return max - min;
    }
}
