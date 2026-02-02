    import java.util.*;
    
    public class CollectionsTasks4 {
    public static void main(String[] args) {
    String sentence = "Java is great and Java is powerful and Java is fun";
    
    // TODO: Split sentence into words
    
    String [] wordByWord = sentence.split(" ");
    
    System.out.println(Arrays.toString(wordByWord));
    
    
    // TODO: Create HashMap to store word frequencies
    
    Map<String, Integer> words = new HashMap<>();
    
    
    for (String word : wordByWord) {
        words.put(word, words.getOrDefault(word, 0) + 1);
    }
    // TODO: Count frequency of each word
    
   for (Map.Entry<String, Integer> entry : words.entrySet()) {
    System.out.println(entry.getKey() +" -> "+ entry.getValue());
    
}
    
  Map.Entry<String, Integer> mostFrequent = words.entrySet().stream()
    .max(Map.Entry.comparingByValue())
    .orElse(null);
    
    
    
    System.out.println("The most frequesnt word: " + mostFrequent);
;    
    // System.out.println(words);
    
    // TODO: Print each word with its count
    
    // TODO: Find the most frequent word
    
    
    
    
    
    }
    }