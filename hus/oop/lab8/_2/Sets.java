package hus.oop.lab8._2;

import java.util.*;

public class Sets {
    /**
     * Function returning the intersection of two given sets
     * (without using library functions)
     */
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();
        for (Integer element : first) {
            if (second.contains(element)) {
                intersection.add(element);
            }
        }
        return intersection;
    }

    /**
     * Function returning the union of two given sets
     * (without using library functions)
     */
    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>();
        union.addAll(first);
        for (Integer element : second) {
            if (!union.contains(element)) {
                union.add(element);
            }
        }
        return union;
    }

    /**
     * Function returning the intersection of two given sets (see retainAll())
     */
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }

    /**
     * Function returning the union of two given sets (see addAll())
     */
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        return union;
    }

    /**
     * Function to transform a set into a list without duplicates
     */
    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new ArrayList<>(source);
        return list;
    }

    /**
     * Function to remove duplicates from a list
     */
    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new LinkedHashSet<>(source);
        List<Integer> list = new ArrayList<>(set);
        return list;
    }

    /**
     * Function to remove duplicates from a list without using the constructor trick
     */
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> listWithoutDuplicates = new ArrayList<>();
        for (Integer element : source) {
            if (!listWithoutDuplicates.contains(element)) {
                listWithoutDuplicates.add(element);
            }
        }
        return listWithoutDuplicates;
    }

    /**
     * Function accepting a string and returning the first recurring character
     */
    public static String firstRecurringCharacter(String s) {
        Set<Character> seenCharacters = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seenCharacters.contains(c)) {
                return String.valueOf(c);
            }
            seenCharacters.add(c);
        }
        return null; // Trả về null nếu không có ký tự lặp lại
    }

    /**
     * Function accepting a string and returning a set comprising all recurring
     * characters
     */
    public static Set<Character> allRecurringChars(String s) {
        Set<Character> recurringChars = new HashSet<>();
        Set<Character> seenChars = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seenChars.contains(c)) {
                recurringChars.add(c);
            } else {
                seenChars.add(c);
            }
        }
        return recurringChars;
    }

    /**
     * Function to transform a set into an array
     */
    public static Integer[] toArray(Set<Integer> source) {
        Integer[] array = new Integer[source.size()];
        source.toArray(array);
        return array;
    }

    /**
     * Function to return the first item from a TreeSet
     */
    public static int getFirst(TreeSet<Integer> source) {
        if (source.isEmpty()) {
            System.out.println("TreeSet is empty");
        }
        return source.first();
    }

    /**
     * Function to return the last item from a TreeSet
     */
    public static int getLast(TreeSet<Integer> source) {
        if (source.isEmpty()) {
            System.out.println("TreeSet is empty");
        }
        return source.last();
    }

    /**
     * Function to get an element from a TreeSet which is strictly greater than a
     * given element
     */
    public static int getGreater(TreeSet<Integer> source, int value) {
        Integer greater = source.higher(value);
        if (greater == null) {
            System.out.println("Khong co phan tu nao lon hon phan tu da cho");
        }
        return greater;
    }
}