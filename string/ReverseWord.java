public class ReverseWord {

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        // To handle the multiple space between the words use " +"
        String words[] = s.split(" +");
        
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i] + " ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s = "This is a ball";
        String result = reverseWords(s);
        System.out.println(result);
    }
}

