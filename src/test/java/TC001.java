import base.BaseTest;
import org.testng.annotations.Test;
import pages.AllPages;

public class TC001 extends BaseTest {

    AllPages allPages=new AllPages();
    @Test
    public void test01(){
        allPages.mainPage().go_To_Url("https://www.hepsiburada.com");

    }
}
