import java.util.List;

public class EvenNumberFilter {

    // The static method
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {

        // The Lambda Expression
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
    }
}
