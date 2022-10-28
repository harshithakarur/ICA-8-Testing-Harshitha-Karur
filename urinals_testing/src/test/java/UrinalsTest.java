import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class UrinalsTest {
    @Test
    void testwriteFile(){
        System.out.println("======Harshitha Karur======TEST ONE EXECUTED=======");
        List<String> s=new ArrayList<>();
        s.add("0");
        Assertions.assertEquals( true , Main.writeFile(s));
    }
}
