package pkg.mentoring.sort;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SelectionSortTest {

    @Test
    public void givenNullInput_ThrowNullPointerException() {
        assertThrows(InvalidParameterException.class, () ->{
            SelectionSort.sort(null);
        });
    }

    @Test
    public void givenUnsortedInput_SortedArrayReturned() {
        int[] input = {23,19,81,54,12,6,7,-8,1110,12};
        int[] expected = {-8,6,7,12,12,19,23,54,81,1110};
        assertEquals(expected, SelectionSort.sort(input));
    }

}
