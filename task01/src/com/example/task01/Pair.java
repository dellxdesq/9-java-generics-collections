package com.example.task01;
import java.util.Objects;
import java.util.function.BiConsumer;

public class Pair<T, U> {
    private final T first;
    private final U second;

    private Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public static <T, U> Pair<T, U> of(T first, U second) {
        return new Pair<>(first, second);
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) obj;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    public int hashCode() {
        return Objects.hash(first, second);
    }

    public void ifPresent(BiConsumer<? super T, ? super U> consumer) {
        if (first != null && second != null) {
            consumer.accept(first, second);
        }
    }
}
