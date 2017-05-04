import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

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
        solution.main(null);
    }
}
