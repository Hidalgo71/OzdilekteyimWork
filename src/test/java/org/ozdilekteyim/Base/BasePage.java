package org.ozdilekteyim.Base;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends BaseTest
{
    //public static WebDriverWait wait;
    public WebDriverWait wait = new WebDriverWait(appiumDriver, 15);
}
