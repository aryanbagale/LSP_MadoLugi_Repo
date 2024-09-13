package org.howard.edu.lsp.assignment2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class WordCount {

    public static void main(String[] args) {
        String inputFilePath = "src/org/howard/edu/lsp/assignment2/words.txt";  // Path to the input file
        Map<String, Integer> wordFrequencyMap = new HashMap<>();  // Map to store word frequencies

        try (Stream<String> fileLines = Files.lines(Paths.get(inputFilePath))) {
            // Iterate through each line from the file
            fileLines.forEach(textLine -> {
                // Output each line to the console (echoing the input)
                System.out.println(textLine);

                // Removing unwanted characters and handling apostrophes for contractions
                String[] parsedWords = textLine.toLowerCase()
                        .replaceAll("[^a-zA-Z\\s']", "")  // Remove non-letter characters, keeping apostrophes
                        .split("\\s+");  // Split the text by whitespace to get individual words

                // Process each word for counting, ignoring trivial words (length <= 3)
                for (String word : parsedWords) {
                    // If a contraction exists, split by apostrophe and process each part separately
                    if (word.contains("'")) {
                        String[] subWords = word.split("'");
                        for (String part : subWords) {
                            if (part.length() > 3) {  // Only count words longer than 3 characters
                                wordFrequencyMap.put(part, wordFrequencyMap.getOrDefault(part, 0) + 1);
                            }
                        }
                    } else if (word.length() > 3) {
                        // If it's not a contraction and longer than 3 characters, count the word
                        wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                    }
                }
            });

            // Sorting the words alphabetically and printing their frequencies
            wordFrequencyMap.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByKey())
                    .forEach(entry -> System.out.println(entry.getKey() + "\t" + entry.getValue()));

        } catch (IOException ex) {
            // Handle any I/O errors that occur during file reading
            ex.printStackTrace();
        }
    }
}