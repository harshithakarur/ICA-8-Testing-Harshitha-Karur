import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.ArrayList;
import java.util.List;

public class UrinalsTest {
    @Test
    void testWriteFile(){
        System.out.println("======Harshitha Karur======TEST ONE EXECUTED=======");
        List<String> s=new ArrayList<>();
        s.add("0");
        Assertions.assertTrue( Main.writeFile(s));
    }

    @Test
    void testCountUrinals(){
        System.out.println("======Harshitha Karur======TEST TWO EXECUTED=======");
        String s="10001";
        Assertions.assertEquals( 1 , Main.countUrinals(s));
    }

    @Test
    void testProcessString(){
        System.out.println("======Harshitha Karur======TEST THREE EXECUTED=======");
        String s="100001";
        Assertions.assertEquals( 1 , Main.countUrinals(s));
    }

    @Test
    void testOpenFile(){
        System.out.println("======Harshitha Karur======TEST FOUR EXECUTED=======");
        List<String> inputLines=new ArrayList<>();
        Assertions.assertTrue( Main.openFile(inputLines));
    }




}
