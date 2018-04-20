import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.iterate(0, a -> a + 1);
        stream
                .filter(integer -> integer>100)
                .filter(integer -> integer<1000)
                .filter(integer -> integer%5==0)
                .limit(10)
                .map(integer -> integer*5)
                .forEach(integer -> System.out.println(integer));
    }
}
