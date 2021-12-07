package org.ozdilekteyim.Pages;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.ozdilekteyim.Base.BasePage;

public class ScrollPage extends BasePage {

    @Step("scroll to end")
    public void scrollToEnd()
    {
        int j=0;
        TouchActions action = new TouchActions(appiumDriver);
        while(j < 2)
        {
            action.scroll(10, 0);
            action.perform();
            j++;
        }
        //action.singleTap()
    }
}
