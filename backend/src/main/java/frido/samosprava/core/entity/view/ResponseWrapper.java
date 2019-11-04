package frido.samosprava.core.entity.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * ResponseWrapper
 */

// public static <T>
// Collector<T, ?, List<T>> toList() {
// return new CollectorImpl<>((Supplier<List<T>>) ArrayList::new, List::add,
// (left, right) -> { left.addAll(right); return left; },
// CH_ID);
// }
public class ResponseWrapper<T> implements Collector<T, ResponseWrapper<T>, ResponseWrapper<T>> {

    List<T> data;

    public ResponseWrapper() {
        data = new ArrayList<>();
    }

    public List<T> getData() {
        return data;
    }

    @Override
    public Supplier<ResponseWrapper<T>> supplier() {
        return ResponseWrapper::new;
    }

    @Override
    public BiConsumer<ResponseWrapper<T>, T> accumulator() {
        return (wrapper, value) -> wrapper.add(value);
    }

    private void add(T value) {
        data.add(value);
    }

    @Override
    public BinaryOperator<ResponseWrapper<T>> combiner() {
        return (wrapper1, wrapper2) -> wrapper1.addAll(wrapper2);
    }

    private ResponseWrapper<T> addAll(ResponseWrapper<T> wrapper2) {
        data.addAll(wrapper2.getData());
        return this;
    }

    @Override
    public Function<ResponseWrapper<T>, ResponseWrapper<T>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH);
    }
}