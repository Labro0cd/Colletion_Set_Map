import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("set", "set", "map", "map", "list", "string"));
        System.out.println(evenNumbersList(numbers));
        System.out.println(evenNumbersSet(numbers));
        System.out.println(uniqueStrings(strings));
        numbersCopyList(strings);
    }

    //Задание 1
    public static List<Integer> evenNumbersList(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>(List.of());
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    // Задание 2
    public static Set<Integer> evenNumbersSet(List<Integer> numbers) {
        Set<Integer> evenNumbers = new HashSet<>(List.of());
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    //Здание 3
    public static Set<String> uniqueStrings(List<String> strings) {
        return new HashSet<>(strings);
    }
    
    //Здание 4

    public static void numbersCopyList(List<String> strings) {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        for (String word : strings) {
            wordCounts.put(word, wordCounts.getOrDefault(word,0)+1);
        }
        for (int count : wordCounts.values()) {
            System.out.println(count);
        }
    }
}