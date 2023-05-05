import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static   List<String> strings = new ArrayList<>(List.of(
          "один", "один", "два","два", "два", "три", "три", "три"));

  public static void main(String[] args) {
        printOddNums();
        System.out.println();
        printOddUniqueNums();
        printUniqueStr();
        printAmountRepeatStr();
    }

    public static void printOddNums() {
        for(Integer i : nums) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printOddUniqueNums() {
        Set<Integer> setNums = new TreeSet<>();
        for(Integer i : nums) {
            if(i % 2 == 0) {
                setNums.add(i);
            }
        }
        System.out.println(setNums);
    }

    public static void printUniqueStr() {
        Set<String> setStr = new HashSet<>(strings);
        System.out.println(setStr);
    }

    public static void printAmountRepeatStr() {
        Map<String, Integer> mapStr = strings.stream()
                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
        mapStr.forEach((k, v) -> System.out.println(v - 1));
    }
}