import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

public class TestDemo {
    @Test
    void testCalcOne()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , Calculator.add(2, 2));
    }
}
