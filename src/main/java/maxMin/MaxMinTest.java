package maxMin;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MaxMinTest {

    @Test
    public void ThenMaxThat10000() {
        List<Integer> testList = List.of(10, 2, 17, 10000, 9999);
        MaxMin maxMin = new MaxMin();
        Integer result = maxMin.max(testList, Integer::compareTo);
        assertThat(result, is(10000) );
    }

    @Test
    public void ThenMinThatMinus5() {
        List<Integer> testList = List.of(5, 7, 10000, -5, 7);
        MaxMin maxMin = new MaxMin();
        Integer result = maxMin.min(testList, Integer::compareTo);
        assertThat(result, is(-5));
    }

}