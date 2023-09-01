package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void calculateSumTest(){
        MyMath math = new MyMath();
        int[] numbers = {1,2,3};
        int result = math.calculateSum(numbers);
        
        int expectedResult = 6;
        assertEquals(expectedResult, result);
    }

}