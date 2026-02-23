import java.util.HashSet;
import java.util.HashMap;

public class WordAnalyzer {

    public void analyze(String sentence) {

        String[] words = sentence.toLowerCase().split(" ");

        HashSet<String> uniqueWords = new HashSet<>();
        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            uniqueWords.add(word);

            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }

        System.out.println("\nUnique Words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        System.out.println("\nWord Frequency:");
        for (String word : frequency.keySet()) {
            System.out.println(word + " : " + frequency.get(word));
        }
    }
}