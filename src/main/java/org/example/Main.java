package org.example;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("огонь", "лошадь", "огонь", "рынок", "внимание", "книга", "дама", "огонь", "личность", "окно", "дама"));

        oddNumbers(nums);

        evenNumbers(nums);

        uniqueWords(words);

        doubleWords(words);
    }

    private static void oddNumbers(List<Integer> numbers) {
        for (Integer num : numbers) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void evenNumbers(List<Integer> numbers) {
        Set<Integer> set = new TreeSet<>(numbers);
        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static void uniqueWords(List<String> words) {
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }

    private static void doubleWords(List<String> words) {
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
                System.out.print(entry.getKey() + " = " + entry.getValue() + ", ");
        }
        System.out.println();
    }
}