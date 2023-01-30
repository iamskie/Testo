package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Cutebaby {
    public static WebDriver driver = null;
    public void cuteBabyTask(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        System.out.println("Starting");
        String url = "https://mycutebaby.in/contest/participant/63c937a267008?utm_source=wsapp_share&utm_campaign=January_2023&utm_medium=shared&utm_term=wsapp_shared_63c937a267008&utm_content=participant";
        driver.get(url);
        driver.findElement(By.xpath("//input[@name=\"v\"]")).sendKeys("AK");
        driver.findElement(By.xpath("//a[@id=\"vote_btn\"]")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //validations

        String postclick = driver.findElement(By.xpath("//div[@class=\"vt_container\"]/h1[2]")).getText();
        //Assert.assertEquals(postclick.trim(),"Vote button will appear here after");
        String votecount = driver.findElement(By.xpath("//h3[@id=\"vote-count\"]")).getText();
        System.out.println(votecount);
        String rank = driver.findElement(By.xpath("//span[@class=\"ranksinfoshow\"]")).getText();
        System.out.println(rank);

        //ends
        driver.quit();
        System.out.println("Test Suite ends");
    }
}