import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CSVWordCounter {
    public static void main(String[] args) {
        String CSVfile = "sample.csv"; 
        K
        // storing word and its frequency in a map
        Map<String, Integer> CountFreq = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(CSVfile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(", ");

                for (String word : words) {
                    word = word.trim().toLowerCase();

                    if (!word.isEmpty()) {
                        CountFreq.put(word, CountFreq.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error reading file: " + e);
        }

        // initializing a priority queue 
        PriorityQueue<Map.Entry<String, Integer>> topWords = new PriorityQueue<>(
                (a, b) -> b.getValue().compareTo(a.getValue())
        );

        // adding all words and frequencies to the priority queue
        topWords.addAll(CountFreq.entrySet());
    
        int count = 3;
        while (count !=0 && !topWords.isEmpty()) {
            Map.Entry<String, Integer> entry = topWords.poll();
            //printint top 3 most frequent words 
            System.out.println(entry.getKey());
            count--;
        }
    }
}
