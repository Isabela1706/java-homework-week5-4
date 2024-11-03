package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {

    static String baseURL = "https://www.saucedemo.com/";

    public static void main(String[] args) {
        //Set up Edge browser
        WebDriver driver = new EdgeDriver();
        driver.get(baseURL);

        //Set the fullscreen
        driver.manage().window().fullscreen();

        //Set time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page.
        System.out.println(driver.getTitle());

        //Print the current URL.
        System.out.println(driver.getCurrentUrl());

        //Print the page source.
        System.out.println(driver.getPageSource());

        //Enter the email in the email field.
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("standard_user");


        //Enter the password in the password field.
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");


        //Click on the Login Button.
        WebElement clickLogin = driver.findElement(By.id("login-button"));
        clickLogin.click();


        //Print the current URL.
        String clickOn = "https://www.saucedemo.com/inventory.html";
        System.out.println(clickOn);

        //Navigate to baseUrl
        driver.navigate().back();


        //Refresh the page.
        driver.navigate().refresh();

        //Close the browser.
        driver.close();

    }

}
