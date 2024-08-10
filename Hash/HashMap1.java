import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        System.out.println();
        // county(key),population(value)
        HashMap<String,Integer> map = new HashMap<>();

        // insertion 
        map.put("India",120);
        map.put("US",30);
        map.put("china",150); 
        map.put("India",140);//update if exist other wise create new
        System.out.println(map);
        System.out.println();

        // Search 
        if(map.containsKey("Indonesia")){
            System.out.println("key is present in map");
        }
        else{
            System.out.println("key is not present in map");
        }
        System.out.println();
        // .get() function to check
        System.out.println(map.get("china"));//key exist
        System.out.println(map.get("Indonesia"));//key does not exist
        System.out.println();

        // Iteration in HashMap - .getKey()
        for(Map.Entry<String,Integer> element : map.entrySet()){
            System.out.print(element.getKey()+" # ");
            System.out.println(element.getValue());
        }
        System.out.println();
        // second method - .keySet()
        Set<String> key = map.keySet();
        for(String value : key){
            System.out.println(value+" @ "+map.get(value));
        }
        System.out.println();

        // delete 
        map.remove("china");
        System.out.println(map);
        System.out.println();

    }
}



