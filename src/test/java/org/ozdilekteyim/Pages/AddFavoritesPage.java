package org.ozdilekteyim.Pages;

import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.ozdilekteyim.Base.BasePage;

public class AddFavoritesPage extends BasePage {

    @Step("add item to favorites")
    public void addFavoritesSpec()
    {
        appiumDriver.findElement(By.id("152882a2-c9f7-402f-ad2b-f5f85630a1af")).click();
    }
}
