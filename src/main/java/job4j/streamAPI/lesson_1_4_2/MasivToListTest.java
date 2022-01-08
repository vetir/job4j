package job4j.streamAPI.lesson_1_4_2;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MasivToListTest {

    @Test
    public void whenConvertThanTrue() {

        MasivToList masivToList = new MasivToList();
        Integer[][] before = {{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10, 12, 14}, {5, 7, 3}};
        List<Integer> after = masivToList.convert(before);
        List<Integer> expected = List.of(1, 3, 5, 7, 9, 2, 4, 6, 8, 10, 12, 14, 5, 7, 3);
        assertEquals(expected, after);
    }
}