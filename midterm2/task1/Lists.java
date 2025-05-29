package oop.mind2.t1;

import java.util.*;
/**
 * ListMapper is a simple Java program that demonstrates:
 *
 * <ul>
 *   <li>Creation of two lists: one of integers (list1) and one of strings (list2).</li>
 *   <li>Establishing a mapping relationship between certain integers and strings using a predefined HashMap.</li>
 *   <li>Generating a third list (list3) by mapping each value from list1 to a corresponding string based on the mapping.</li>
 *   <li>Filtering list3 to retain only the repeated values, producing a reduced list.</li>
 * </ul>
 *
 * <p>
 * The mapping is defined manually based on a known association between integers in list1 and string values
 * (some of which are present in list2), as follows:
 * </p>
 * <pre>
 *     5 → q3g9C
 *     8 → cHL
 *     2 → Tjnlm
 *     3 → SYPAb
 *     7 → uoKyy
 *     6 → KQlGb
 *     9 → bJO
 * </pre>
 *
 * <p>
 * Example execution produces:
 * </p>
 * <ul>
 *   <li>Original list3 with 13 string values mapped from list1.</li>
 *   <li>Reduced list showing only those strings that appear more than once, including multiple entries.</li>
 * </ul>
 *
 * <p>
 * This program illustrates the use of Java collections (List, Map), stream-based iteration,
 * and basic frequency counting using HashMap.
 * </p>
 *
 */
public class Lists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(5, 8, 2, 8, 3, 8, 7, 6, 6, 6, 2, 9, 9);

        List<String> list2 = Arrays.asList(
                "1Vms", "GQqS", "Xdi94", "Tjnlm", "k96", "SYPAb", "y7n", "r3h4g",
                "UVS", "q3g9C", "FYuw", "KQlGb", "gzK1M", "uoKyy", "fbu", "cHL",
                "3vW", "bJO"
        );
        
        Map<Integer, String> mapping = new HashMap<>();
        mapping.put(5, "q3g9C");
        mapping.put(8, "cHL");
        mapping.put(2, "Tjnlm");
        mapping.put(3, "SYPAb");
        mapping.put(7, "uoKyy");
        mapping.put(6, "KQlGb");
        mapping.put(9, "bJO");

        List<String> list3 = new ArrayList<>();
        for (int num : list1) {
            if (mapping.containsKey(num)) {
                list3.add(mapping.get(num));
            }
        }

    
        System.out.println("Original list3:");
        for (String s : list3) {
            System.out.println(s);
        }
        
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String s : list3) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }

        List<String> reducedList = new ArrayList<>();
        for (String s : list3) {
            if (frequencyMap.get(s) > 1 && !reducedList.contains(s)) {
                for (int i = 0; i < frequencyMap.get(s); i++) {
                    reducedList.add(s);
                }
            }
        }

        System.out.println("\nReduced list:");
        for (String s : reducedList) {
            System.out.println(s);
        }
    }
}