import java.util.*;

class _1207UniqueOccurance {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        if(arr.length == 0){
            return false;
        }

        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);  
                // 1 is starting count of any key
            }
        }
        
        HashSet<Integer> set = new HashSet<>(map.values());
        if(map.size() == set.size()){
            return true;
        }
        return false;
    }
}
