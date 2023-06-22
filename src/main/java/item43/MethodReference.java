package item43;

import autovalue.shaded.com.google.common.base.Function;
import autovalue.shaded.com.google.common.base.Supplier;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.function.Consumer;

public class MethodReference {

    public static void main(String[] args) {
        // 정적
        Function<String, Integer> mrStatic = Integer::parseInt;

        // 한정적(인스턴스)
        Function<ChronoLocalDateTime<?>, Boolean> mrBound = LocalDateTime.now()::isAfter;

        // 비한정적(인스턴스)
        Function<String, String> mrUnBound = String::toLowerCase;

        // 클래스 생성자
        Supplier<MethodReference> mrConstructor = MethodReference::new;

        // 배열 생성자
        Consumer<Integer> mrArray = int[]::new;
    }
}
