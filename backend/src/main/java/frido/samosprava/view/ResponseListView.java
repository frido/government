package frido.samosprava.view;

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
public class ResponseListView<T> implements Collector<T, ResponseListView<T>, ResponseListView<T>> {

    List<T> data;

    public ResponseListView() {
        data = new ArrayList<>();
    }

    public List<T> getData() {
        return data;
    }

    @Override
    public Supplier<ResponseListView<T>> supplier() {
        return ResponseListView::new;
    }

    @Override
    public BiConsumer<ResponseListView<T>, T> accumulator() {
        return (wrapper, value) -> wrapper.add(value);
    }

    private void add(T value) {
        data.add(value);
    }

    @Override
    public BinaryOperator<ResponseListView<T>> combiner() {
        return (wrapper1, wrapper2) -> wrapper1.addAll(wrapper2);
    }

    private ResponseListView<T> addAll(ResponseListView<T> wrapper2) {
        data.addAll(wrapper2.getData());
        return this;
    }

    @Override
    public Function<ResponseListView<T>, ResponseListView<T>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.IDENTITY_FINISH);
    }
}