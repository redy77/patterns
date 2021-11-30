package com.viktor.testSelenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * @author Viktor Bakakin
 */
public class FirstTest {

    @Test
    public void firstTest (){
        System.setProperty("webdriver.chrome.driver", "f:/Papa/drivers/chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.delivery-club.ru/moscow");
        String title = chromeDriver.getTitle();
        Assert.assertTrue(title.equals("Доставка еды из ресторанов Москвы от 15 минут! Delivery Club"));
        chromeDriver.quit();
    }
}
