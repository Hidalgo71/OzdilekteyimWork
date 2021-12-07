package org.ozdilekteyim.Pages;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.ozdilekteyim.Base.BasePage;

public class SearchCategoryPage extends BasePage {


    @Step("wait <2> seconds")
    public void waitSeconds(int wait) throws InterruptedException
    {
        Thread.sleep(wait * 1000L);
    }

    @Step("tap start shopping")
    public void startShopping() throws InterruptedException
    {
        appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore")).click();
    }

    @Step("tap <category>")
    public void category(String cat)
    {
        appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/nav_categories")).click();
    }

    @Step("tap <kadın>")
    public void kadinTap(String womanTap)
    {
        appiumDriver.findElement(By.id("cb4f36c3-0058-4909-a6b9-e22cfa20e6f3")).click();
    }

    @Step("tap <pantalon>")
    public void pantalonTap(String pant)
    {
        appiumDriver.findElement(By.id("220f7c4a-c5b4-412b-9036-e3365aa5fc14")).click();
    }
}
