import java.util.HashMap;

public class MinimumFrequencyCharacter  {  
    public static void main(String[] args) {  
        String input = "cdadcda"; // Example input  
        char result = findLeastFrequentCharacter(input);  
        System.out.println(result); // Output: c  
    }  

    public static char findLeastFrequentCharacter(String str) {  
        HashMap<Character, Integer> map = new HashMap<>();  

        // Count the frequency of each character  
        for (char c : str.toCharArray()) {  
            map.put(c, map.getOrDefault(c, 0) + 1);  
        }  
        
        char leastFrequentChar = '\0';  
        int minFrequency = Integer.MAX_VALUE;  

        // Find the character with the minimum frequency  
        for (char c : str.toCharArray()) {  
            int frequency = map.get(c);  
            if (frequency < minFrequency) {  
                minFrequency = frequency;  
                leastFrequentChar = c;  
            }  
        }  

        return leastFrequentChar;  
    }  
}

