package Hashmap;

// import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {
        // CREATE HASHMAP
        HashMap<String, List<Integer>> employeeWorkingHour = new HashMap<>();
        employeeWorkingHour.put("Employee 1 ", new ArrayList<>(Arrays.asList(2, 4, 3, 4, 5, 8, 8)));
        employeeWorkingHour.put("Employee 2 ", new ArrayList<>(Arrays.asList(7, 3, 4, 3, 3, 4, 4)));
        employeeWorkingHour.put("Employee 3 ", new ArrayList<>(Arrays.asList(3, 3, 4, 3, 3, 2, 2)));
        employeeWorkingHour.put("Employee 4 ", new ArrayList<>(Arrays.asList(9, 3, 4, 7, 3, 4, 1)));
        employeeWorkingHour.put("Employee 5 ", new ArrayList<>(Arrays.asList(3, 5, 4, 3, 6, 3, 8)));
        employeeWorkingHour.put("Employee 6 ", new ArrayList<>(Arrays.asList(3, 4, 4, 6, 3, 4, 4)));
        employeeWorkingHour.put("Employee 7 ", new ArrayList<>(Arrays.asList(3, 7, 4, 8, 3, 8, 4)));
        employeeWorkingHour.put("Employee 8 ", new ArrayList<>(Arrays.asList(6, 3, 5, 9, 2, 7, 9)));

        // Get a list of Map entries from the HashMap
        List<java.util.Map.Entry<String, List<Integer>>> entries = new ArrayList<>(employeeWorkingHour.entrySet());

        // Sort the list based on the sum of values in each entry
        entries.sort(Comparator.comparingInt(entry -> entry.getValue().stream().mapToInt(Integer::intValue).sum()));

        // Print each key to separate employee in row, sorted by the sum of values in
        // ascending order
        System.out.println("\t      Su  M  T  W  Th F  Sa");
        for (java.util.Map.Entry<String, List<Integer>> entry : entries) {
            String key = entry.getKey();
            List<Integer> values = entry.getValue();
            int sum = values.stream().mapToInt(Integer::intValue).sum();
            System.out.print(key + ":   ");
            for (int value : values) {
                System.out.print(value + "  ");
            }
            System.out.println(" Sum: " + sum);
        }

    }

}
