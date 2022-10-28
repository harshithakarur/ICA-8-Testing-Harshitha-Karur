import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

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
//        List<String> s=new ArrayList<>();
//        s.add("10001");
//        s.add("1001");
//        s.add("110");
//        s.add("1000100");
        String s="100001";
        Assertions.assertEquals( 1 , Main.countUrinals(s));
    }

    @Test
    void testOpenFile(){
        System.out.println("======Harshitha Karur======TEST FOUR EXECUTED=======");
        Assertions.assertTrue( Main.openFile());
    }


}
