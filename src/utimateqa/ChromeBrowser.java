package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();

        //open the URL into Browser
        driver.get(baseUrl);

        //Get the Title of the page
        System.out.println("Title of the page : " + driver.getTitle());

        //Get the Current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());

        // Get Page Source
        System.out.println("Page source :" + driver.getPageSource());

        // Find the Email ID filed Element and type Email ID
        driver.findElement(By.id("user[email]")).sendKeys("prime123@gmail.com");


        // Find the password field Element and Type the password
        driver.findElement(By.name("user[password]")).sendKeys("Prime123");

        // Close the Browser
        //  driver.close();
    }
}
