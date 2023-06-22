package item44;

import java.util.function.Function;
import java.util.function.Predicate;

public class Foo {

    public static void main(String[] args) {
        System.out.println("result = " + Foo.addOne().apply(10));// 11

        System.out.println("result = " + Foo.isZero().test(10));// false
    }

    public static Function<Integer, Integer> addOne() {
        return (val) -> val + 1;
    }

    public static Predicate<Integer> isZero() {
        return (value) -> value == 0;
    }
}
