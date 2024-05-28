package testsuite;
/**
 * 3. Write down the following test into ‘LoginTest’ class
 * 1. userSholdLoginSuccessfullyWithValidCredentials
 * * Enter “Admin” username
 * * Enter “admin123 password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Dashboard’ text is display
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


public class LoginTest extends BaseTest {
    //BaseUrl
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    //calling openBrowser method from parentclass BaseTest
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    //  1. userSholdLoginSuccessfullyWithValidCredentials
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // * * Enter “Admin” username
        driver.findElement(By.name("username")).sendKeys("Admin");

        // * * Enter “admin123 password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // * * Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

        driver.findElement(By.xpath("//input[@class = 'oxd-input oxd-input--active']")).sendKeys("Hello");

        //* * Verify the ‘Dashboard’ text is display
        String expectedtext = "Dashboard";
        String actualtext = driver.findElement(By.xpath("//h6[text() = 'Dashboard']")).getText();
        Assert.assertEquals("User is not navigated to Dashboard page", expectedtext, actualtext);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}


