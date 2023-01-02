import org.junit.Test;

import services.CalcService;
import view.UserResponse;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class CalcTest {
    
    @Test
    public void multArrbyNumWhenBothIsNull(){
        CalcService service = new CalcService<>();

        assertEquals(service.mulArrByNum(null, null), new UserResponse("Error. Both is Null"));
    }

    @Test
    public void multArrbyNumWhenOneIsNull(){
        CalcService service = new CalcService<>();

        assertEquals(service.mulArrByNum(null, 1), new UserResponse("Error. Some is Null"));
    }

    @Test
    public void multArrbyNumWhenSecondIsBigger(){
        CalcService service = new CalcService<>();

        ArrayList<Integer> example2 = new ArrayList();
        example2.add(1);
        example2.add(0);
        ArrayList<Integer> example3 = new ArrayList();
        example3.add(2);
        example3.add(4);
        example3.add(6);

        assertEquals(service.mulArrByArr(example2, example3), "[2.0, 0.0, 6.0]");
    }

}
