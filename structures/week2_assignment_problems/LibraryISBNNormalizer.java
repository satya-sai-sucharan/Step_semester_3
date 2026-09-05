package structures.week2_assignment_problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StopWordFrequencyReport {

    static void generateReport(String text, String stopWords) {

        String[] words = text.toLowerCase().split("\\s+");
        String[] stopWordArray = stopWords.toLowerCase().split("\\s+");

        Set<String> stopSet = new HashSet<>();

        for (String word : stopWordArray) {
            stopSet.add(word);
        }

        Map<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            if (stopSet.contains(word)) {
                continue;
            }

            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        String text = "java is easy and java is powerful";

        String stopWords = "is and";

        generateReport(text, stopWords);
    }
}
