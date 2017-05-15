import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * @Author John Antonio Collins
 * Created on 5/4/17.
 */
public class Solution_only_main_Test
{
    Solution_only_main solution;
    String simulatedInput;

    @Before
    public void setUp(){
        solution = new Solution_only_main();
        simulatedInput = "5 1 -2 4 -5 1";
    }

    @Test
    public void Solution_only_main_main_Test(){
        ByteArrayInputStream simIn = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(simIn);
        ByteArrayOutputStream getOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(getOut));
        solution.main(null);
        String actual = getOut.toString().trim();
        String expected = "9";
        assertEquals(expected, actual);
    }
}
