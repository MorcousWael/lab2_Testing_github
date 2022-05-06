package classes;

import java.util.ArrayList;

public class min_max {
    public Integer max(ArrayList<Integer> arr){
        if(arr.size() == 0){
            return null;
        }
        if(arr.size() == 1){
            return arr.get(0);
        }
        Integer max = arr.get(0);
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) > max){
                max = arr.get(i);
            }
        }
        return max;
    }
    public Integer min(ArrayList<Integer> arr){
        if(arr.size() == 0){
            return null;
        }
        if(arr.size() == 1){
            return arr.get(0);
        }
        Integer min = arr.get(0);
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) < min){
                min = arr.get(i);
            }
        }
        return min;
    }

}
