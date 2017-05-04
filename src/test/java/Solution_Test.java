import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * @Author John Antonio Collins
 * Created on 5/3/17.
 */
public class Solution_Test
{
    Solution solution;
    int[] inputArray;
    String elements;
    int length;

    @Before
    public void setUp()
    {
        solution = new Solution();
        inputArray = new int[]{1, -2, 4, -5, 1};
        elements = "1 -2 4 -5 1";
        length = 5;
    }

    @Test
    public void sumSubArrays_Test()
    {
        int actual = solution.sumSubArrays(inputArray);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void getInput_Test()
    {
        String simInput = Integer.toString(length) + " " + elements;
        ByteArrayInputStream simIn = new ByteArrayInputStream(simInput.getBytes());
        System.setIn(simIn);

        solution.getInput();

        String actual = Arrays.toString(solution.myArray);
        String expected = "[1, -2, 4, -5, 1]";
        assertEquals(expected, actual);
    }
}
