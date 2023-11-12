package lab6;

import java.util.ArrayList;
import java.util.List;

class OddAndEven{
    public static <T extends Number> SumResult sumEvenOdd(List<T> numbers) {
        int evenSum = 0;
        int oddSum = 0;

        for (T number : numbers) {
            if (number.intValue() % 2 == 0) {
                evenSum += number.intValue();
            } else {
                oddSum += number.intValue();
            }
        }

        return new SumResult(evenSum, oddSum);
    }

    static class SumResult {
        private final int evenSum;
        private final int oddSum;

        public SumResult(int evenSum, int oddSum) {
            this.evenSum = evenSum;
            this.oddSum = oddSum;
        }

        public int getEvenSum() {
            return evenSum;
        }

        public int getOddSum() {
            return oddSum;
        }
    }
}
class ReverseList {
    public static void main(String[] args) {
            // Example usage with a list of any type
        List<String> originalList = List.of("apple", "banana", "cherry", "date");
        List<String> reversedList = reverseList(originalList);
        System.out.println("Original List: " + originalList);
        System.out.println("Reversed List: " + reversedList);
    }
    public static <T> List<T> reverseList(List<T> originalList) {
        List<T> reversedList = new ArrayList<>(originalList);
        java.util.Collections.reverse(reversedList);
        return reversedList;
    }
}


