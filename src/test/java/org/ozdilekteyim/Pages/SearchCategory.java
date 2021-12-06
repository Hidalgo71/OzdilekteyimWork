package org.ozdilekteyim.Pages;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.ozdilekteyim.Base.BasePage;

public class SearchCategory extends BasePage {


    @Step("<6> saniye bekle")
    public void waitSeconds(int wait) throws InterruptedException
    {
        Thread.sleep(wait * 1000);
        System.out.println(wait + " Bekledi");
    }

    @Step("Alışverişe başla tıkla")
    public void startShopping() throws InterruptedException {
        //wait.until(ExpectedCondition.)
        //Thread.sleep(2000);
        System.out.println("start bekliyor");
        appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore\n")).click();
        System.out.println("tıkladı devam");
    }
}
