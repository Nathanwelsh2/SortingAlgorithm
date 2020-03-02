package pkg.mentoring.sort;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BubbleSortTest {

    @Test
    public void givenNullInput_ThrowNullPointerException(){
        assertThrows(InvalidParameterException.class, () ->{
            BubbleSort.sort(null);
        });
    }

    @Test
    public void givenUnsortedInput_SortedArrayReturned() {
        int[] input = {23,19,81,54,12,6,7,-8,1110,12};
        int[] expected = {-8,6,7,12,12,19,23,54,81,1110};
        assertEquals(expected, BubbleSort.sort(input));
    }
}
