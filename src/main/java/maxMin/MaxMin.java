package maxMin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxMin {

    public <T> T max(List<T> value, Comparator<T> comparator) {
        return calculate(value, comparator);
    }

    public <T> T min(List<T> value, Comparator<T> comparator) {
        return calculate(value, comparator.reversed());
    }

    private <T> T calculate(List<T> value, Comparator<T> comparator) {
        T result = value.get(0);
        for (T element : value) {
            if (comparator.compare(result, element) > 0) {
                result = result;
            } else {
                result = element;
            }
        }
        return result;
    }

}
