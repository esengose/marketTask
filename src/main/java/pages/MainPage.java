package pages;

import base.BaseStepMethod;
import base.BaseTest;
import org.testng.annotations.Test;

public class MainPage extends BaseStepMethod {

    public void go_To_Url(String url){
        BaseTest.driver.get(url);
    }

}
