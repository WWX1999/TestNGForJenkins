import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.util.logging.Logger;

import static org.testng.Assert.*;

public class DemoTest {


    @Test
    public void simpleTestCase(){
        //Reporter.log("start test......");
        System.out.println("start test......");
        Assert.assertEquals(2*3,6);
        assertNotEquals(2, 1);
        Assert.assertEquals(3.0/2.0,1.5);
    }

    @Test
    public void f() {
        System.out.println("This is test f" );
    }
    @Test
    public void g() {
        System.out.println("This is test g" );
    }
    @Test
    public void h() {
        System.out.println("This is test h " );
    }
    @Test
    public void i() {
        System.out.println("This is test i" );
    }
}